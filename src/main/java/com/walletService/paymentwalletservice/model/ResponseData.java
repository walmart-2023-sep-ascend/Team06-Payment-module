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
	
	
	@Override
	public String toString() {
		return "ResponseData [responsecode=" + responsecode + ", userId=" + userId + ", walletAmount=" + walletAmount
				+ ", message=" + message + ", authenticated=" + authenticated + ", cartId=" + cartId + ", TotalAmount="
				+ TotalAmount + ", destinationOfShipping=" + destinationOfShipping + ", deliverydate=" + deliverydate
				+ "]";
	}
	
	
	

}
