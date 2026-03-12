package com.ktdsuniversity.edu.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

/**
 * Dao : Data Access Object
 * - Java에서 DB로 데이터 생성,수정,삭제,조회를 하기 위한 클래스
 */
public class ReplyDao {
	
	private DataAccessHelper dah;
	public ReplyDao(DataAccessHelper dah) {
		this.dah = dah;
	}
	
	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회(대댓글 포함) - 계층 조회!
//	public List<ReplyVO> readAllReply(String boardId) {
//		// UPDATE => 조회수를 1증가
//		// 연결끝
//		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
//		try {
//			// SELECT => 증가 후 게시글의 내용 조회
//			// fetchRow - 해당 인터페이스에 데이터를 넣는다.
//			// result에 rs의 내용을 넣는다.
//			List<ReplyVO> result = new ArrayList<>();
//			dah.preparedStatement(ReplyQuery.makeSelectAllQuery(), (pstmt) -> {
//				pstmt.setString(1, boardId);
//			});
//			dah.executeQuery(SQLType.SELECT, rs -> {
////				eachArticle에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
//				ReplyVO eachReply = new ReplyVO();
//				eachReply.setId(rs.getString("ID"));									// ReplyVO
//				eachReply.setBoardId(rs.getString("BOARD_ID"));												// ReplyVO
//				eachReply.setTopId(rs.getString("TOP_ID"));							// ReplyVO
//				eachReply.setContent(rs.getString("CONTENT"));							// ReplyVO
//				eachReply.setWriteDate(rs.getString("WRITE_DATE"));						// ReplyVO
////				한줄한줄 넣은것을 result에 add
//				result.add(eachReply);		// List<BoardVO>
//			});
//			
//			dah.commit();
//			
//			return result;
//		}
//		catch(RuntimeException re) {
//			dah.rollback();
//			System.out.println(re.getMessage());
//		}
//		finally{
//			dah.close();
//		}
//		
//		return null;
//	}
	
	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회(대댓글 포함) - 계층 조회!
	public List<ReplyVO> readAllReply(String boardId) {
		// result에 rs의 내용을 넣는다.
		List<ReplyVO> result = new ArrayList<>();
		dah.preparedStatement(ReplyQuery.makeSelectAllQuery(), (pstmt) -> {
			pstmt.setString(1, boardId);
		});
		dah.executeQuery(SQLType.SELECT, rs -> {
//				eachArticle에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
			ReplyVO eachReply = new ReplyVO();
			eachReply.setId(rs.getString("ID"));									// ReplyVO
			eachReply.setBoardId(rs.getString("BOARD_ID"));												// ReplyVO
			eachReply.setTopId(rs.getString("TOP_ID"));							// ReplyVO
			eachReply.setContent(rs.getString("CONTENT"));							// ReplyVO
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));						// ReplyVO
//				한줄한줄 넣은것을 result에 add
			result.add(eachReply);		// List<BoardVO>
		});
				
		return result;
	}
	// ReplyVO 댓글 조회(댓글 아이디)
//	public ReplyVO readReply(String replyId) {
//		
//		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
//		try {
//			
//			// result에 rs의 내용을 넣는다.
//			ReplyVO result = new ReplyVO();
//			dah.preparedStatement(ReplyQuery.makeSelectOneQuery(), (pstmt) -> {
//				pstmt.setString(1, replyId);
//			});
//			
//			dah.executeQuery(SQLType.SELECT, rs -> {
////				result에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
//				result.setId(rs.getString("ID"));
//				result.setBoardId(rs.getString("BOARD_ID"));
//				result.setTopId(rs.getString("TOP_ID"));
//				result.setContent(rs.getString("CONTENT"));
//				result.setWriteDate(rs.getString("WRITE_DATE"));
//			});
//			
//			dah.commit();
//			
//			return result;
//		}
//		catch(RuntimeException re) {
//			dah.rollback();
//			System.out.println(re.getMessage());
//		}
//		finally{
//			dah.close();
//		}
//		
//		return null;
//	}
	
	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
		
		// result에 rs의 내용을 넣는다.
		ReplyVO result = new ReplyVO();
		dah.preparedStatement(ReplyQuery.makeSelectOneQuery(), (pstmt) -> {
			pstmt.setString(1, replyId);
		});
		
		dah.executeQuery(SQLType.SELECT, rs -> {
//				result에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
			result.setId(rs.getString("ID"));
			result.setBoardId(rs.getString("BOARD_ID"));
			result.setTopId(rs.getString("TOP_ID"));
			result.setContent(rs.getString("CONTENT"));
			result.setWriteDate(rs.getString("WRITE_DATE"));
		});
		
		
		return result;
	}

	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회(대댓글 포함) - 계층 조회!
//	public List<ReplyVO> readAllReplyComment(String replyId) {
//		// UPDATE => 조회수를 1증가
//		// 연결끝
//		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
//		try {
//			// SELECT => 증가 후 게시글의 내용 조회
//			// fetchRow - 해당 인터페이스에 데이터를 넣는다.
//			// result에 rs의 내용을 넣는다.
//			List<ReplyVO> result = new ArrayList<>();
//			dah.preparedStatement(ReplyQuery.makeSelectReplyCommentAllQuery(), (pstmt) -> {
//				pstmt.setString(1, replyId);
//			});
//			dah.executeQuery(SQLType.SELECT, rs -> {
////				eachArticle에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
//				ReplyVO eachReply = new ReplyVO();
//				eachReply.setId(rs.getString("ID"));									// ReplyVO
//				eachReply.setBoardId(rs.getString("BOARD_ID"));												// ReplyVO
//				eachReply.setTopId(rs.getString("TOP_ID"));							// ReplyVO
//				eachReply.setContent(rs.getString("CONTENT"));							// ReplyVO
//				eachReply.setWriteDate(rs.getString("WRITE_DATE"));						// ReplyVO
////				한줄한줄 넣은것을 result에 add
//				result.add(eachReply);		// List<BoardVO>
//			});
//			
//			dah.commit();
//			
//			return result;
//		}
//		catch(RuntimeException re) {
//			dah.rollback();
//			System.out.println(re.getMessage());
//		}
//		finally{
//			dah.close();
//		}
//		
//		return null;
//	}
	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회(대댓글 포함) - 계층 조회!
	public List<ReplyVO> readAllReplyComment(String replyId) {
		// SELECT => 증가 후 게시글의 내용 조회
		// fetchRow - 해당 인터페이스에 데이터를 넣는다.
		// result에 rs의 내용을 넣는다.
		List<ReplyVO> result = new ArrayList<>();
		dah.preparedStatement(ReplyQuery.makeSelectReplyCommentAllQuery(), (pstmt) -> {
			pstmt.setString(1, replyId);
		});
		dah.executeQuery(SQLType.SELECT, rs -> {
//				eachArticle에 rs.getString(1) 즉,쿼리문의 첫번째 값을 넣어준다. 그러나 순서는 쿼리를 어떻게 짜는지에 따라달라지므로 순서보다 컬럼명을 넣어주는것이 좋다.
			ReplyVO eachReply = new ReplyVO();
			eachReply.setId(rs.getString("ID"));									// ReplyVO
			eachReply.setBoardId(rs.getString("BOARD_ID"));												// ReplyVO
			eachReply.setTopId(rs.getString("TOP_ID"));							// ReplyVO
			eachReply.setContent(rs.getString("CONTENT"));							// ReplyVO
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));						// ReplyVO
//				한줄한줄 넣은것을 result에 add
			result.add(eachReply);		// List<BoardVO>
		});
		
		return result;
	}
	
	
	// void 댓글 등록(ReplyVO)
//	public void createNewReply(ReplyVO newReply) {
//		
//		// 연결끝
//		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
//		
//		try {
//			dah.preparedStatement(ReplyQuery.makeInsertQuery(), (pstmt) -> {
//				pstmt.setString(1, newReply.getBoardId());
//				pstmt.setString(2, newReply.getTopId());
//				pstmt.setString(3, newReply.getContent());
//			});
//			
//			dah.executeQuery(SQLType.INSERT, null);
//			dah.commit();
//		}
//		catch(RuntimeException re) {
//			dah.rollback();
//			System.out.println(re.getMessage());
//		}
//		finally{
//			dah.close();
//		}
//	}

	public void createNewReply(ReplyVO newReply) {
		dah.preparedStatement(ReplyQuery.makeInsertQuery(), (pstmt) -> {
			pstmt.setString(1, newReply.getBoardId());
			pstmt.setString(2, newReply.getTopId());
			pstmt.setString(3, newReply.getContent());
		});
		
		dah.executeQuery(SQLType.INSERT, null);
	}

	
	// void 댓글 수정(ReplyVO)
//	public void modifyReply(ReplyVO modifyReply) {
//		// 연결끝
//		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
//		
//		try {
//			dah.preparedStatement(ReplyQuery.makeUpdateQuery(), (pstmt) -> {
//				pstmt.setString(1, modifyReply.getContent());
//				pstmt.setString(2, modifyReply.getId());
//			});
//			
//			dah.executeQuery(SQLType.UPDATE, null);
//			dah.commit();
//		}
//		catch(RuntimeException re) {
//			dah.rollback();
//			System.out.println(re.getMessage());
//		}
//		finally{
//			dah.close();
//		}
//	}
	
	public void modifyReply(ReplyVO modifyReply) {
		dah.preparedStatement(ReplyQuery.makeUpdateQuery(), (pstmt) -> {
			pstmt.setString(1, modifyReply.getContent());
			pstmt.setString(2, modifyReply.getId());
		});
		
		dah.executeQuery(SQLType.UPDATE, null);
	}

	
	// void 댓글 삭제(댓글 아이디)
//	public void deleteReply(String replyId) {
//		// 연결끝
//		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
//		
//		try {
//			dah.preparedStatement(ReplyQuery.makeDeleteQuery(), (pstmt) -> {
//				pstmt.setString(1, replyId);
//			});
//			
//			dah.executeQuery(SQLType.DELETE, null);
//			dah.commit();
//		}
//		catch(RuntimeException re) {
//			dah.rollback();
//			System.out.println(re.getMessage());
//		}
//		finally{
//			dah.close();
//		}
//	}
	
	public void deleteReply(String replyId) {
		dah.preparedStatement(ReplyQuery.makeDeleteQuery(), (pstmt) -> {
			pstmt.setString(1, replyId);
		});
		
		dah.executeQuery(SQLType.DELETE, null);
	}

}
