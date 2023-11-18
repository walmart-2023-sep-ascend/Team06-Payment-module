package com.walletService.paymentwalletservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ShippngCart")
public class ShippngCart {
	 private int shippingId;
     private int cartId;
     private String typeOfShipping;
     private String destinationOfShipping;
     private double shippingCost;
     private int deliveryDuration;
     
	public int getShippingId() {
		return shippingId;
	}
	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getTypeOfShipping() {
		return typeOfShipping;
	}
	public void setTypeOfShipping(String typeOfShipping) {
		this.typeOfShipping = typeOfShipping;
	}
	public String getDestinationOfShipping() {
		return destinationOfShipping;
	}
	public void setDestinationOfShipping(String destinationOfShipping) {
		this.destinationOfShipping = destinationOfShipping;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	public int getDeliveryDuration() {
		return deliveryDuration;
	}
	public void setDeliveryDuration(int deliveryDuration) {
		this.deliveryDuration = deliveryDuration;
	}
	@Override
	public String toString() {
		return "ShippngCart [shippingId=" + shippingId + ", cartId=" + cartId + ", typeOfShipping=" + typeOfShipping
				+ ", destinationOfShipping=" + destinationOfShipping + ", shippingCost=" + shippingCost
				+ ", deliveryDuration=" + deliveryDuration + "]";
	}
     

}
