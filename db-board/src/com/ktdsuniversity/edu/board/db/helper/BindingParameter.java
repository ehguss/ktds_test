package com.ktdsuniversity.edu.board.db.helper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@FunctionalInterface
// 람다 사용가능
public interface BindingParameter {

	public void bind(PreparedStatement pstmt) throws SQLException;
	
}
