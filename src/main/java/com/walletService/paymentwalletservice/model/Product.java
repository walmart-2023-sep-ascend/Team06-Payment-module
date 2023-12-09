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
public class Product {
	int productId;
	int quantity;
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", quantity=" + quantity + "]";
	}
}
