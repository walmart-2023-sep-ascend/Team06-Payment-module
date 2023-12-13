package com.walletService.paymentwalletservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.walletService.paymentwalletservice.model.Order;

@FeignClient(name = "order-service", url = "${capstone.orderservice.url}", fallback = OrderFeignClientFallback.class)
public interface OrderFeignClient {

	@PostMapping("/addorder")
	ResponseEntity<Order> addOrder(@RequestBody Order order);
}
