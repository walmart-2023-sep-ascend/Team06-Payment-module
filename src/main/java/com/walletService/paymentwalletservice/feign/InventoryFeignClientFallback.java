package com.walletService.paymentwalletservice.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import com.walletService.paymentwalletservice.model.InventoryResponse;

public class InventoryFeignClientFallback implements InventoryFeignClient{
	
	private static final Logger logger = LoggerFactory.getLogger(InventoryFeignClientFallback.class);
	
	@Override
	public ResponseEntity<InventoryResponse> updateInventory(int cartId) {
		logger.info("Inventoryfallback: Inventory service is down");
		return null;
	}

}
