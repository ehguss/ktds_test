package com.ktdsuniversity.edu.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ktdsuniversity.edu.board.dao.query.BoardQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.BoardVO;

/**
 * Dao : Data Access Object
 * - Java에서 DB로 데이터 생성,수정,삭제,조회를 하기 위한 클래스
 */
public class BoardDao {

	//select - 게시글 조회
	public BoardVO readArticle(String articleId) {
		
		// UPDATE => 조회수를 1증가
		// 연결끝
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		try {
			dah.preparedStatement(BoardQuery.makeUpdateViewCountQuery(), (pstmt) -> {
				pstmt.setString(1, articleId);
			});
			
			dah.executeQuery(SQLType.UPDATE, null);
			
			// SELECT => 증가 후 게시글의 내용 조회
			// fetchRow - 해당 인터페이스에 데이터를 넣는다.
			
			// result에 rs의 내용을 넣는다.
			BoardVO result = new BoardVO();
			dah.preparedStatement(BoardQuery.makeSelectOneQuery(), (pstmt) -> {
				pstmt.setString(1, articleId);
			});
			
			dah.executeQuery(SQLType.SELECT, rs -> {
//				result에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
				result.setId(rs.getString("ID"));
				result.setTitle(rs.getString("TITLE"));
				result.setContent(rs.getString("CONTENT"));
				result.setViewCount(rs.getInt("VIEW_COUNT"));
				result.setWriteDate(rs.getString("WRITE_DATE"));
				result.setLatestModifyDate(rs.getString("LATEST_MODIFY_DATE"));
			});
			
			dah.commit();
			
			return result;
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally{
			dah.close();
		}
		
		return null;
	}
	
	//delete
	public void deleteArticle(String articleId) {
		// 연결끝
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		
		try {
			dah.preparedStatement(BoardQuery.makeDeleteQuery(), (pstmt) -> {
				pstmt.setString(1, articleId);
			});
			
			dah.executeQuery(SQLType.DELETE, null);
			dah.commit();
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally{
			dah.close();
		}
	}
	//update
	public void modifyArticle(BoardVO modifyArticle) {
		// 연결끝
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		
		try {
			dah.preparedStatement(BoardQuery.makeUpdateQuery(), (pstmt) -> {
				pstmt.setString(1, modifyArticle.getTitle());
				pstmt.setString(2, modifyArticle.getContent());
				pstmt.setString(3, modifyArticle.getId());
			});
			
			dah.executeQuery(SQLType.UPDATE, null);
			dah.commit();
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally{
			dah.close();
		}
	}
	
	//insert
	public void createNewArticle2(BoardVO newArticle) {
		
		// 연결끝
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		
		try {
			dah.preparedStatement(BoardQuery.makeInsertQuery(), (pstmt) -> {
				pstmt.setString(1, newArticle.getTitle());
				pstmt.setString(2, newArticle.getContent());
			});
			
			dah.executeQuery(SQLType.INSERT, null);
			dah.commit();
		}
		catch(RuntimeException re) {
			dah.rollback();
			System.out.println(re.getMessage());
		}
		finally{
			dah.close();
		}
	}

	public int createNewArticle(BoardVO newArticle) {
		
		//DB에 INSERT하기
		// 1. ojdbc11.jar 파일이 프로젝트에 존재하는지 확인(OracleDriver.class 파일의 유무 확인하기)
		try {
			// oracle.jdbc.driver.OracleDriver 클래스를 불러온다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// oracle.jdbc.driver.OracleDriver를 찾기 못했을 때
			// 실행되는 예외처리 블럭.
//			e.printStackTrace();
			System.out.println("오라클 데이터베이스에 접속하기 위한 라이브러리가 없습니다.");
			return 0;
		}
		
		// 2. OracleDB에 접속.
		Connection connection = null;
		//DriverManager.getConnection(DB의 주소, 해당DB에서 사용할 DB이름, DB PWD)
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "BOARD", "BOARD");
			// MANUAL COMMIT(AUTO COMMIT 아님)으로 변경
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// 올바르게 연결이 되지 않았을 경우
//			e.printStackTrace();
			System.out.println("데이터베이스 연결을 할 수 없습니다.");
			System.out.println("사유:" + e.getMessage());
			return 0;
		}
		// 3. INSERT Query 작성.
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO BOARD 															");
		query.append(" (ID																			");
		query.append(" , TITLE																		");
		query.append(" , CONTENT																		");
		query.append(" , WRITE_DATE)																	");
		query.append(" VALUES																		");
		query.append(" ('BO-' || TO_CHAR(SYSDATE, 'YYYYMMDD-') || LPAD(SEQ_BOARD_PK.NEXTVAL, 6, 0)	");
		query.append(" , ?																			");
		query.append(" , ?																			");
		query.append(" , SYSDATE)																	");
		
		// 3-1. ?에 데이터 할당하기
		PreparedStatement pstmt = null;
		try {
			// 오류가 나는 시점에 따라 pstmt가 null인지 아닌지가 달라진다.(pipe가 있는지 없는지 달라진다.) -> connection을 닫기 전에 물어봐야함.(pstmt의 pip가 만들어져있니?) -> 68
			pstmt = connection.prepareStatement(query.toString());
			pstmt.setString(1, newArticle.getTitle());
			pstmt.setString(2, newArticle.getContent());
		} catch (SQLException e) {
			// pstmt의 파이프가 만들어져있는 상태에서 예외가 발생했다면
			// 닫는다.
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e1) {}// 할수 있는게 없음
			}
			
			
			
			// 연결된 Connection을 닫는다.
			try {
				connection.close();
			} catch (SQLException e1) {}// 할수 있는게 없음
			// 1. 데이터베이스와 연결이 끊어져있을 때
			// 2. 작성된 쿼리의 내용이 잘못되었을 때
			System.out.println("쿼리 내용에 문제가 있습니다.");
			System.out.println("사유: " + e.getMessage());
			return 0;
		}
		
		// 4. INSERT Query 실행.
		try {
			int insertCount = pstmt.executeUpdate();
			// 가장 마지막 동작에서 ERROR가 없다면 이때 COMMIT한다.
			connection.commit();
			return insertCount;
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {}// 할수 있는게 없음
			// insert가 제대로 되지않았을때
			// 1. Insert 쿼리에 파라미터 할당이 잘못되었을때(예> ?는 2개인데, 할당한 데이터는 1개일때)
			// 2. pk가 중복되었을때
			// 3. column의 type과 insert하는 값이 다를 때
			// 4. column이 허용하는 최대 길이보다 값의 길이가 더 클 때
			System.out.println("쿼리 실행을 실패했습니다.");
			System.out.println("사유 : " + e.getMessage());
			return 0;
		}
		finally {
			try {
				pstmt.close();
			} catch (SQLException e) {}
			
			try {
				connection.close();
			} catch (SQLException e) {}
		}
	}



}
