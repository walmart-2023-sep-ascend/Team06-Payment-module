package com.walletService.paymentwalletservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection="ShippngCart")
public class ShippngCart {
	 private int shippingId;
     private int cartId;
     private String typeOfShipping;
     private String destinationOfShipping;
     private double shippingCost;
     private int deliveryDuration;
	@Override
	public String toString() {
		return "ShippngCart [shippingId=" + shippingId + ", cartId=" + cartId + ", typeOfShipping=" + typeOfShipping
				+ ", destinationOfShipping=" + destinationOfShipping + ", shippingCost=" + shippingCost
				+ ", deliveryDuration=" + deliveryDuration + "]";
	}
}
