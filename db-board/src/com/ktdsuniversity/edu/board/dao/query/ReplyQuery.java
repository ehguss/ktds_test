package com.ktdsuniversity.edu.board.dao.query;

public class ReplyQuery {

	// 댓글 등록
	public static String makeInsertQuery() {
		StringBuffer query = new StringBuffer();

		query.append(" INSERT INTO REPLY																");
		query.append("  (ID																				");
		query.append(" , BOARD_ID																		");
		query.append(" , TOP_ID																		");
		query.append(" , CONTENT																		");
		query.append(" , WRITE_DATE)																	");
		query.append(" VALUES																			");
		query.append("  ('RP-' || TO_CHAR(SYSDATE, 'YYYYMMDD-') || LPAD(SEQ_REPLY_PK.NEXTVAL, 6, 0)		");
		query.append(" , ?																				");
		query.append(" , ?																				");
		query.append(" , ?																				");
		query.append(" , SYSDATE)																		");
	
		return query.toString();
	}
	
	// 댓글 수정
	public static String makeUpdateQuery() {
		StringBuffer query = new StringBuffer();
		
        query.append(" UPDATE REPLY								");
        query.append(" 		   SET CONTENT=?	");
        query.append("      , WRITE_DATE= SYSDATE				");
        query.append(" WHERE ID=?			");
		
        return query.toString();
	}
	
	// 댓글 삭제
	public static String makeDeleteQuery() {
		StringBuffer query = new StringBuffer();
		
		query.append(" DELETE  		");
		query.append("   FROM REPLY	");
		query.append("  WHERE ID = ?");
		
		return query.toString();
	}

	public static String makeSelectOneQuery() {
		StringBuffer query = new StringBuffer();
		
		query.append(" SELECT ID														");
		query.append("  , BOARD_ID														");
		query.append("  , TOP_ID														");
		query.append("  , CONTENT														");
		query.append("  , TO_CHAR(WRITE_DATE, 'YYYY-MM-DD HH24:MI:SS') AS WRITE_DATE	");
		query.append(" FROM REPLY														");
		query.append(" WHERE ID = ?														");
	 
		return query.toString();
	}

	public static String makeSelectAllQuery() {
		StringBuffer query = new StringBuffer();

		query.append("  SELECT ID															");
		query.append("       , BOARD_ID														");
		query.append("       , TOP_ID														");
		query.append("       , CONTENT														");
		query.append("       , TO_CHAR(WRITE_DATE, 'YYYY-MM-DD HH24:MI:SS') AS WRITE_DATE	");
		query.append("    FROM REPLY														");
		query.append("   WHERE BOARD_ID = ? 												");
		query.append("   START WITH TOP_ID IS NULL											");
		query.append(" CONNECT BY PRIOR ID = TOP_ID											");
		return query.toString();
	}
	
	public static String makeSelectReplyCommentAllQuery() {
		StringBuffer query = new StringBuffer();

		query.append("  SELECT REP.ID															");
		query.append("       , REP.BOARD_ID														");
		query.append("       , REP.TOP_ID														");
		query.append("       , REP.CONTENT														");
		query.append("       , TO_CHAR(REP.WRITE_DATE, 'YYYY-MM-DD HH24:MI:SS') AS WRITE_DATE	");
		query.append("    FROM REPLY REP														");
		query.append("   INNER JOIN REPLY COM 												");
		query.append("      ON REP.TOP_ID = COM.ID 												");
		query.append("   START WITH REP.ID = ?												");
		query.append(" CONNECT BY PRIOR REP.ID = COM.TOP_ID											");
		return query.toString();
	}
}
