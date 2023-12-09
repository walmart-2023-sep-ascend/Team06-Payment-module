package com.walletService.paymentwalletservice.model;

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
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", cartId=" + cartId + ", userId=" + userId + ", dateOfOrder="
				+ dateOfOrder + ", amount=" + amount + ", modeOfPayment=" + modeOfPayment + ", paymentStatus="
				+ paymentStatus + ", dateOfDelivery=" + dateOfDelivery + ", statusOfOrder=" + statusOfOrder + "]";
	}
	
}

