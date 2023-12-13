package com.walletService.paymentwalletservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.walletService.paymentwalletservice.model.InventoryResponse;

@FeignClient(name = "inventory-update-service", url = "${capstone.inventoryupdate.url}", fallback = InventoryFeignClientFallback.class)
public interface InventoryFeignClient {

	@GetMapping("/inventoryupdate/{cartId}")
	ResponseEntity<InventoryResponse> updateInventory(@PathVariable("cartId") int cartId);
}
