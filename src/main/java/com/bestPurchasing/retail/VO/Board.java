package com.bestPurchasing.retail.VO;

import java.util.Date;

public class Board {

	private long		bID;
	private String		title;
	private long		writer;
	private String		contents;
	private String		comments;
	private Date		date;
	
	/*
	 * Constructor
	 */
	public Board() {
		super();
	}
	public Board(long bID, String title, long writer, String contents, String comments, Date date) {
		super();
		this.bID = bID;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.comments = comments;
		this.date = date;
	}
	
	/*
	 * Getters and Setters
	 */
	public long getbID() {
		return bID;
	}
	public void setbID(long bID) {
		this.bID = bID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getWriter() {
		return writer;
	}
	public void setWriter(long writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
