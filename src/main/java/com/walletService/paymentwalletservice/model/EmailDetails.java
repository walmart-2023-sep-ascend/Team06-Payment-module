package com.walletService.paymentwalletservice.model;
import java.util.List;

public class EmailDetails {
	private String subject;
	private String custName;
	private String custEmail;
	private String order_id;
	private String cart_id;
	private String delivery_date;
	private String shippingCost;
	public String getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

	private String totalAmount;
	
	List<ProductResponse> productResponse;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getCart_id() {
		return cart_id;
	}

	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<ProductResponse> getProductResponse() {
		return productResponse;
	}

	public void setProductResponse(List<ProductResponse> productResponse) {
		this.productResponse = productResponse;
	}
	

	
}