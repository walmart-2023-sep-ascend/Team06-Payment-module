package com.walletService.paymentwalletservice.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import com.walletService.paymentwalletservice.model.Order;

public class OrderFeignClientFallback implements OrderFeignClient{

	private static final Logger logger = LoggerFactory.getLogger(OrderFeignClientFallback.class);
	
	@Override
	public ResponseEntity<Order> addOrder(Order order) {
		logger.info("Orderfallback: order service is down");
		return null;
	}

}
