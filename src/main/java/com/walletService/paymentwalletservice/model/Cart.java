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
public class Cart {
	private int cartId;
	private List<Product> product;
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", product=" + product + "]";
	}
	
}