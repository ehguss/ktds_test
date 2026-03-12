package com.ktdsuniversity.edu.tmdb.service;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.dao.AppearanceDao;
import com.ktdsuniversity.edu.tmdb.dao.CategoryDao;
import com.ktdsuniversity.edu.tmdb.dao.MakeDao;
import com.ktdsuniversity.edu.tmdb.dao.MovieDao;
import com.ktdsuniversity.edu.tmdb.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.tmdb.vo.AppearanceVO;
import com.ktdsuniversity.edu.tmdb.vo.CategoryVO;
import com.ktdsuniversity.edu.tmdb.vo.MakeVO;
import com.ktdsuniversity.edu.tmdb.vo.MovieVO;

public class MovieService {

	private DataAccessHelper dah;
	private MovieDao movieDao;
	private CategoryDao categoryDao;
	private MakeDao makeDao;
	private AppearanceDao appearanceDao;
	
	//생성자
	public MovieService(DataAccessHelper dah) {
		this.dah = dah;
		// MovieDao에도 dah 연결
		this.movieDao = new MovieDao(this.dah);
		this.categoryDao = new CategoryDao(this.dah);
		this.makeDao = new MakeDao(this.dah);
		this.appearanceDao = new AppearanceDao(this.dah);
	}

	// 영화정보 select(try-catch 필요 없음)
	public MovieVO readMovie(String movieId) {
		
		MovieVO movie = this.movieDao.selectMovie(movieId);
		// 영화아이디를 이용하여 카테고리들을 조회한다.
		List<CategoryVO> categories = this.categoryDao.selectCategoriesByMovieId(movieId);
		// 조회한 카테고리들을 movie에 setting한다.
		movie.setCategory(categories);
		
		List<MakeVO> make = this.makeDao.selectMakeByMovieId(movieId);
		movie.setMake(make);
		
		List<AppearanceVO> appearances = this.appearanceDao.selectAppearancesByMovieId(movieId);
		movie.setAppearance(appearances);
		
		return movie;
	}

}
