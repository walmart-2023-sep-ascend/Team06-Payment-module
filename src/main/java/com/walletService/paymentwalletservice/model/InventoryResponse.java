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
public class InventoryResponse {

	private int cartId;
	private List<Product> product;
	private List<Products> products;
	private String inventoryStatus;
	@Override
	public String toString() {
		return "InventoryResponse [cartId=" + cartId + ", product=" + product + ", products=" + products
				+ ", inventoryStatus=" + inventoryStatus + "]";
	}
	
		
}