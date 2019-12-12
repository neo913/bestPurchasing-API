package com.bestPurchasing.retail.VO;

public class Cart {

	private Product		product;
	private int			quantity;
	
	/*
	 * Constructor
	 */
	public Cart() {
		super();
	}
	public Cart(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	/*
	 * Getters and Setters
	 */
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
