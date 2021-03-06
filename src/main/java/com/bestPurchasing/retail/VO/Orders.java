package com.bestPurchasing.retail.VO;

import java.util.Date;

public class Orders {

	private long		oID;
	private long		uID;
	private String		products;
	private Date		date;
	private String		address1;
	private String		address2;
	private String 		province;
	private String 		postal;
	private String		note;
	private String		paidMethod;
	private String		cardNumber;
	private double		totalPrice;
	private boolean		paid;
	
	/*
	 * Constructor
	 */
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(long oID, long uID, String products, Date date, String address1, String address2, String province,
			String postal, String note, String paidMethod, String cardNumber, double totalPrice, boolean paid) {
		super();
		this.oID = oID;
		this.uID = uID;
		this.products = products;
		this.date = date;
		this.address1 = address1;
		this.address2 = address2;
		this.province = province;
		this.postal = postal;
		this.note = note;
		this.paidMethod = paidMethod;
		this.cardNumber = cardNumber;
		this.totalPrice = totalPrice;
		this.paid = paid;
	}
	
	/*
	 * Getters and Setters
	 */
	public long getoID() {
		return oID;
	}
	public void setoID(long oID) {
		this.oID = oID;
	}
	public long getuID() {
		return uID;
	}
	public void setuID(long uID) {
		this.uID = uID;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPaidMethod() {
		return paidMethod;
	}
	public void setPaidMethod(String paidMethod) {
		this.paidMethod = paidMethod;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
				
}