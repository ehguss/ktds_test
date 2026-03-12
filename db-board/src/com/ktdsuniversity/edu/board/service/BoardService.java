package com.ktdsuniversity.edu.board.service;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.BoardDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.vo.BoardVO;

/**
 * 트랜잭션 처리
 */

public class BoardService {
	
	
	private DataAccessHelper dah;
	private BoardDao boardDao;
	
	public BoardService(DataAccessHelper dah) {
		this.dah = dah;		// 해당 생성자를 통해 dah를 받아와서 BoardService dah에 넣어준다.
		this.boardDao = new BoardDao(this.dah);		// 해당 생성자를 통해 새로 생성한 BoardDao()를 boardDao에 넣어준다.	
	}
	
	//분리한 dao 순차적으로 알맞게 호출하기
	public BoardVO readArticle(String articleId) {
		
		try {
			this.boardDao.updateViewCount(articleId);
			BoardVO result = this.boardDao.readArticle(articleId);
			this.dah.commit();
			return result;
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
		return null;
	}
	
	public List<BoardVO> readAllArticles() {
		
		List<BoardVO> result = this.boardDao.readAllArticles();
		return result;
	}
	
	
	public void deleteArticle(String articleId) {
		try {
			this.boardDao.deleteArticle(articleId);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
	
	public void modifyArticle(BoardVO modifyArticle) {
		try {
			this.boardDao.modifyArticle(modifyArticle);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}

	public void createNewArticle2(BoardVO newArticle) {
		try {
			this.boardDao.createNewArticle2(newArticle);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}


}
