package com.bestPurchasing.retail.VO;

import java.util.Date;

public class Board {

	private long		bId;
	private String		title;
	private User		writer;
	private String		contents;
	private Comment[]	comments;
	private Date		createdTime;
	private Date		modifiedTime;
	
	/*
	 * Constructor
	 */
	public Board() {
		super();
	}
	public Board(long bId, String title, User writer, String contents, Comment[] comments, Date createdTime,
			Date modifiedTime) {
		super();
		this.bId = bId;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.comments = comments;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}
	
	/*
	 * Getters and Setters
	 */
	public long getbId() {
		return bId;
	}
	public void setbId(long bId) {
		this.bId = bId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getWriter() {
		return writer;
	}
	public void setWriter(User writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Comment[] getComments() {
		return comments;
	}
	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
	
}
