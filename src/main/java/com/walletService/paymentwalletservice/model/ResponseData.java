package com.walletService.paymentwalletservice.model;

public class ResponseData {
	private String responsecode;
	private int userId;
	private float walletAmount;
	private String message;
	private boolean authenticated;
	
	private String typeOfShipping;
	
	private int cartId;
	private double TotalAmount;
	private String destinationOfShipping;
	private String deliverydate;
	
	private long orderId;
	private String phone;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long l) {
		this.orderId = l;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTypeOfShipping() {
		return typeOfShipping;
	}
	public void setTypeOfShipping(String typeOfShipping) {
		this.typeOfShipping = typeOfShipping;
	}
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getDestinationOfShipping() {
		return destinationOfShipping;
	}
	public void setDestinationOfShipping(String destinationOfShipping) {
		this.destinationOfShipping = destinationOfShipping;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliveryDate2) {
		this.deliverydate = deliveryDate2;
	}
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(float walletAmount) {
		this.walletAmount = walletAmount;
	}
	public String getResponsecode() {
		return responsecode;
	}
	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ResponseData [responsecode=" + responsecode + ", userId=" + userId + ", walletAmount=" + walletAmount
				+ ", message=" + message + ", authenticated=" + authenticated + ", cartId=" + cartId + ", TotalAmount="
				+ TotalAmount + ", destinationOfShipping=" + destinationOfShipping + ", deliverydate=" + deliverydate
				+ "]";
	}
	
	
	

}
