package com.ktdsuniversity.edu.tmdb.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.query.MakeQuery;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.db.helper.SQLType;
import com.ktdsuniversity.edu.tmdb.vo.MakeVO;
import com.ktdsuniversity.edu.tmdb.vo.ProducerVO;

public class MakeDao {

	private DataAccessHelper dah;
	public MakeDao(DataAccessHelper dah) {
		this.dah = dah;
	}
	public List<MakeVO> selectMakeByMovieId(String movieId) {
		
		List<MakeVO> result = new ArrayList<>();
		
		this.dah.preparedStatement(MakeQuery.makeSelectQuery(), (pstmt)->{
			pstmt.setString(1, movieId);
		});
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			MakeVO eachMake = new MakeVO();
			eachMake.setMakeId(rs.getString("MAKE_ID"));
			eachMake.setMovieId(rs.getString("MOVIE_ID"));
			eachMake.setProducerId(rs.getString("PRODUCER_ID"));
			eachMake.setRole(rs.getString("ROLE"));
			eachMake.setPart(rs.getString("PART"));

			ProducerVO eachProducer = new ProducerVO();
			eachProducer.setProducerId(rs.getString("PRODUCER_ID"));
			eachProducer.setProducerName(rs.getString("PRODUCER_NAME"));
			
			// MakeVO에 ProducerVO가 getter/setter 되어있음 -> has-a 관계에 의해
			eachMake.setProducer(eachProducer);
			result.add(eachMake);
		});
		return result;
	}


}
