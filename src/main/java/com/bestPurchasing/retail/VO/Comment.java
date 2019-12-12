package com.bestPurchasing.retail.VO;

import java.util.Date;

public class Comment {

	private long		cId;
	private long		bId;
	private String		contents;
	private	User		writer;
	private Date		createdTime;
	private Date		modifiedTime;
	
	/*
	 * Constructor
	 */
	public Comment() {
		super();
	}
	public Comment(long cId, long bId, String contents, User writer, Date createdTime, Date modifiedTime) {
		super();
		this.cId = cId;
		this.bId = bId;
		this.contents = contents;
		this.writer = writer;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}
	
	/*
	 * Getters and Setters
	 */
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public long getbId() {
		return bId;
	}
	public void setbId(long bId) {
		this.bId = bId;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public User getWriter() {
		return writer;
	}
	public void setWriter(User writer) {
		this.writer = writer;
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
