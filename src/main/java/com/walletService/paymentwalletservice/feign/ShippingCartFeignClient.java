package com.walletService.paymentwalletservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.walletService.paymentwalletservice.model.Order;
import com.walletService.paymentwalletservice.model.ShippingInput;
import com.walletService.paymentwalletservice.model.ShippngCart;

@FeignClient(name = "Shipping-service", url = "${capstone.shippingcart.url}", fallback = ShippingCartFeignClientFallback.class)
public interface ShippingCartFeignClient {
	
	@PostMapping("/cart/calculateShipping")
	ShippngCart getShippingDetails(@RequestBody ShippingInput shinnpingInput);
	
	@PostMapping("/updateOrder")
	Order notifyOrder(@RequestBody Order order);
}
