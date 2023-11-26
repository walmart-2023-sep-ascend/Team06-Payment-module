package com.walletService.paymentwalletservice.model;

public class Order {
	private int orderId;
	private int cartId;
	private int userId;
	private String dateOfOrder;
	private float amount;
	private String modeOfPayment;
	private String paymentStatus;
	private String dateOfDelivery;
	private String statusOfOrder;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(String dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public String getStatusOfOrder() {
		return statusOfOrder;
	}
	public void setStatusOfOrder(String statusOfOrder) {
		this.statusOfOrder = statusOfOrder;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cartId=" + cartId + ", userId=" + userId + ", dateOfOrder="
				+ dateOfOrder + ", amount=" + amount + ", modeOfPayment=" + modeOfPayment + ", paymentStatus="
				+ paymentStatus + ", dateOfDelivery=" + dateOfDelivery + ", statusOfOrder=" + statusOfOrder + "]";
	}
	
}

