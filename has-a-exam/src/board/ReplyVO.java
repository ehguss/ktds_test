package board;

import java.util.List;

/**
 * @TableName REPLY
 * @TableComment 게시글의 댓글. 대댓글도 포함
 */
public class ReplyVO {

    /**
     * @ColumnName ID
     * @ColumnType VARCHAR2(18)
     * @ColumnComment 댓글의 아이디(RP-YYYYMMDD-일련번호(6자리))
     */
    private String id;

    /**
     * @ColumnName BOARD_ID
     * @ColumnType VARCHAR2(18)
     * @ColumnComment 댓글을 작성한 게시글의 아이디(BO-YYYYMMDD-일련번호(6자리))
     */
    private String boardId;

    /**
     * @ColumnName TOP_ID
     * @ColumnType VARCHAR2(18)
     * @ColumnComment 대댓글의 상위 댓글 아이디 (RP-YYYYMMDD-일련번호(6자리))
     */
    private String topId;

    /**
     * @ColumnName CONTENT
     * @ColumnType CLOB
     * @ColumnComment 댓글의 내용
     */
    private String content;

    /**
     * @ColumnName WRITE_DATE
     * @ColumnType DATE
     * @ColumnComment 댓글을 작성한 날짜와 시간
     */
    private String writeDate;

    // erd의 관계를 생각하여 조건별로 필요한 클래스 불러오기(has-a관계)
    private List<ReplyVO> replyCommentList;

	public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getBoardId() {
        return this.boardId;
    }
    
    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }
    
    public String getTopId() {
        return this.topId;
    }
    
    public void setTopId(String topId) {
        this.topId = topId;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getWriteDate() {
        return this.writeDate;
    }
    
    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    public List<ReplyVO> getReplyCommentList() {
		return replyCommentList;
	}

	public void setReplyCommentList(List<ReplyVO> replyCommentList) {
		this.replyCommentList = replyCommentList;
	}
    
    @Override
    public String toString() {
        return "ReplyVO(id: " + id + ", boardId: " + boardId + ", topId: " + topId + ", content: " + content + ", writeDate: " + writeDate + ", )";
    }
}