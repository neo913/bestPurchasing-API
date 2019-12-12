package com.bestPurchasing.retail.VO;

public class User {

	private long		uID;
	private String		uName;
	private String		fName;
	private String		lName;
	private String		address1;
	private String		address2;
	private String 		province;
	private String 		postal;
	private String 		phone;
	private String		note;
	
	/*
	 *	Constructor 
	 */
	public User() {
		super();
	}
	public User(long uID, String uName, String fName, String lName, String address1, String address2, String province,
			String postal, String phone, String note) {
		super();
		this.uID = uID;
		this.uName = uName;
		this.fName = fName;
		this.lName = lName;
		this.address1 = address1;
		this.address2 = address2;
		this.province = province;
		this.postal = postal;
		this.phone = phone;
		this.note = note;
	}
	
	/*
	 *	Getters and Setters 
	 */
	public long getuID() {
		return uID;
	}
	public void setuID(long uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
		
}
