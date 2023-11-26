package com.walletService.paymentwalletservice.model;
import java.util.List;

public class InventoryResponse {

	private int cartId;
	private List<Product> product;
	private List<Products> products;
	private String inventoryStatus;
	public InventoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public String getInventoryStatus() {
		return inventoryStatus;
	}
	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}
	@Override
	public String toString() {
		return "InventoryResponse [cartId=" + cartId + ", product=" + product + ", products=" + products
				+ ", inventoryStatus=" + inventoryStatus + "]";
	}
	
	
	
	
}