package com.walletService.paymentwalletservice.model;

public class Products {

	int productId;
	int availableQty;
	String productName;
	int productRetailPrice;
	public Products() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getAvailableQty() {
		return availableQty;
	}
	public void setAvailableQty(int availableQty) {
		this.availableQty = availableQty;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductRetailPrice() {
		return productRetailPrice;
	}
	public void setProductRetailPrice(int productRetailPrice) {
		this.productRetailPrice = productRetailPrice;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", availableQty=" + availableQty + ", productName=" + productName
				+ ", productRetailPrice=" + productRetailPrice + "]";
	}
}