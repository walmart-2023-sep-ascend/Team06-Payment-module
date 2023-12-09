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
public class InputData {
	private int userId;
	private float totalAmount;
	private int otp;
	private int cartId;
	private int amount;
	@Override
	public String toString() {
		return "InputData [userId=" + userId + ", totalAmount=" + totalAmount + ", otp=" + otp + ", cartId=" + cartId
				+ ", amount=" + amount + "]";
	}
	
}
