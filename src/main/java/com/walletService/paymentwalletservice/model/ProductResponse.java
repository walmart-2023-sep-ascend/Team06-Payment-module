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
public class ProductResponse {
	
	private String prodName;
	private String prodQuantity;
	private String prodRetialPrice;
	private String prodPrice;
	@Override
	public String toString() {
		return "ProductResponse [prodName=" + prodName + ", prodQuantity=" + prodQuantity + ", prodRetialPrice="
				+ prodRetialPrice + ", prodPrice=" + prodPrice + "]";
	}
}
