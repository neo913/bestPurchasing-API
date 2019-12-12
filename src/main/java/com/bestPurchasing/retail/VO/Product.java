package com.bestPurchasing.retail.VO;

public class Product {

	private long		pID;
	private String		name;
	private String		brand;
	private String		category;
	private double		price;
	private int			stock;
	private int			offer;
	private String		description;

	/*
	 * Constructor
	 */
	public Product() {
		super();
	}
	public Product(long pID, String name, String brand, String category, double price, int stock, int offer,
			String description) {
		super();
		this.pID = pID;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.offer = offer;
		this.description = description;
	}
	
	/*
	 * Getters and Setters
	 */
	public long getpID() {
		return pID;
	}
	public void setpID(long pID) {
		this.pID = pID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
