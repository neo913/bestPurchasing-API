package com.bestPurchasing.retail.VO;

import java.util.Date;

public class Comment {

	private long		cID;
	private long		bID;
	private String		contents;
	private	long		writer;
	private Date		date;
	
	/*
	 * Constructor
	 */
	public Comment() {
		super();
	}
	public Comment(long cID, long bID, String contents, long writer, Date date) {
		super();
		this.cID = cID;
		this.bID = bID;
		this.contents = contents;
		this.writer = writer;
		this.date = date;
	}
	
	/*
	 * Getters and Setters
	 */
	public long getcID() {
		return cID;
	}
	public void setcID(long cID) {
		this.cID = cID;
	}
	public long getbID() {
		return bID;
	}
	public void setbID(long bID) {
		this.bID = bID;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public long getWriter() {
		return writer;
	}
	public void setWriter(long writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
			
}
