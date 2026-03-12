package com.ktdsuniversity.edu.board.service;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

/**
 * 트랜잭션 처리
 */
public class ReplyService {
	
	private DataAccessHelper dah;
	private ReplyDao replyDao;
	
	public ReplyService(DataAccessHelper dah) {
		this.dah = dah;		// 해당 생성자를 통해 dah를 받아와서 BoardService dah에 넣어준다.
		this.replyDao = new ReplyDao(this.dah);		// 해당 생성자를 통해 새로 생성한 BoardDao()를 boardDao에 넣어준다.	
	}
	
	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회(대댓글 포함) - 계층 조회!
	public List<ReplyVO> readAllReply(String boardId) {
		List<ReplyVO> result = this.replyDao.readAllReply(boardId);
		return result;
	}
	
	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
		ReplyVO result = this.replyDao.readReply(replyId);
		return result;
	}

	
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	public List<ReplyVO> readAllReplyComment(String replyId) {

		List<ReplyVO> result = this.replyDao.readAllReplyComment(replyId);
		return result;
	}
	
	
	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newReply) {
		try {
			this.replyDao.createNewReply(newReply);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}

	
	// void 댓글 수정(ReplyVO)
	public void modifyReply(ReplyVO modifyReply) {
		try {
			this.replyDao.modifyReply(modifyReply);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}

	
	// void 댓글 삭제(댓글 아이디)
	public void deleteReply(String replyId) {
		try {
			this.replyDao.deleteReply(replyId);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}

}
