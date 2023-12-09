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
public class Products {

	int productId;
	int availableQty;
	String productName;
	int productRetailPrice;
	
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", availableQty=" + availableQty + ", productName=" + productName
				+ ", productRetailPrice=" + productRetailPrice + "]";
	}
	
}