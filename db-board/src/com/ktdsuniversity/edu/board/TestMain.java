package com.ktdsuniversity.edu.board;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.BoardDao;
import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.service.BoardService;
import com.ktdsuniversity.edu.board.service.ReplyService;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class TestMain {

	public static void main(String[] args) {
		
		// 게시글 작성. (DB 게시글 생성)
		
		BoardVO newArticle = new BoardVO();
		newArticle.setTitle("새로운 게시글입니다.");
		newArticle.setContent("새로운 게시글의 내용입니다.");
		
//		BoardDao boardDao = new BoardDao();    트랜잭션을 하지않으므로 트랜잭션을 하는 service를 이용하기
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		BoardService boardService = new BoardService(dah);
//		int insertCount = boardDao.createNewArticle(newArticle);
//		boardDao.createNewArticle2(newArticle);
		boardService.createNewArticle2(newArticle);
//		System.out.println(insertCount +"개의 게시글이 생성되었습니다.");
		
		
		BoardVO modifyArticle = new BoardVO();
		modifyArticle.setId("BO-20260303-000004");
		modifyArticle.setTitle("제목이 수정되었습니다.");
		modifyArticle.setContent("내용이 수정되었습니다.");
		
//		boardDao.modifyArticle(modifyArticle);
		boardService.modifyArticle(modifyArticle);
		
//		boardDao.deleteArticle("BO-20260303-000008");
		boardService.deleteArticle("BO-20260303-000008");
		
		BoardVO article = boardService.readArticle("BO-20260303-000001");
		System.out.println(article);
		
		List<BoardVO> articleList = boardService.readAllArticles();
		System.out.println(articleList);

//		ReplyDao replyDao = new ReplyDao();
		ReplyService replyService = new ReplyService(dah);
		
		ReplyVO newReply = new ReplyVO();
		newReply.setBoardId("BO-20260304-000045");
		newReply.setTopId("RP-20260304-000028");
		newReply.setContent("두번째 대댓글입니다.");
		
		replyService.createNewReply(newReply);
		
		ReplyVO modifyReply = new ReplyVO();
		modifyReply.setContent("여덟번째 댓글입니다.");
		modifyReply.setId("RP-20260304-000008");
		
		replyService.modifyReply(modifyReply);
		replyService.deleteReply("RP-20260304-000026");
		
		ReplyVO reply = replyService.readReply("RP-20260304-000015");
		System.out.println(reply);
		

		List<ReplyVO> replyList = replyService.readAllReply("BO-20260303-000022");
		System.out.println(replyList);
		
		List<ReplyVO> replyCommentList = replyService.readAllReplyComment("RP-20260304-000015");
		System.out.println(replyCommentList);
		
		//pipe 끊기
		dah.close();
	}

}
