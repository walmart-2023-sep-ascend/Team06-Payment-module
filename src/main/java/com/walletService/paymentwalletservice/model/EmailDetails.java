package com.walletService.paymentwalletservice.model;
import java.util.List;


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
public class EmailDetails {
	private int userId;
	private int cartId;
	private String subject;
	private String custName;
	private String custEmail;
	private String order_id;
	private String delivery_date;
	private String shippingCost;
	private String totalAmount;
	List<ProductResponse> productResponse;
	@Override
	public String toString() {
		return "EmailDetails [userId=" + userId + ", cartId=" + cartId + ", subject=" + subject + ", custName="
				+ custName + ", custEmail=" + custEmail + ", order_id=" + order_id + ", delivery_date=" + delivery_date
				+ ", shippingCost=" + shippingCost + ", totalAmount=" + totalAmount + ", productResponse="
				+ productResponse + "]";
	}
	
}