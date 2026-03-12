package com.ktdsuniversity.edu.tmdb.dao.query;

public class AppearanceQuery {

	public static String selectMovie() {
		return null;
	}

	public static String makeSelectQuery() {
		
		StringBuffer query = new StringBuffer();
		
		query.append(" SELECT A.APPEARANCE_ID 				");
		query.append(" 		, A.ACTOR_ID 				");
		query.append(" 		, A.MOVIE_ID 				");
		query.append(" 		, A.\"CHARACTER\" 			");
		query.append(" 		, AC.ACTOR_NAME 				");
		query.append(" 		, AC.ACTOR_PROFILE_URL 		");
		query.append("	 FROM APPEARANCE A				");
		query.append("  INNER JOIN ACTOR AC			");
		query.append("     ON A.ACTOR_ID = AC.ACTOR_ID 	");
		query.append("	WHERE A.MOVIE_ID = ?			");
		return query.toString();
	}

}
