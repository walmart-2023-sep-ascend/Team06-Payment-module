package com.walletService.paymentwalletservice.model;

public class Product {
	int productId;
	int quantity;
	public Product() {
		super();
	}
	public Product(int productId, int quantity) {
		super();
		this.productId = productId;
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", quantity=" + quantity + "]";
	}

}
