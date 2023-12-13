package com.walletService.paymentwalletservice.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.walletService.paymentwalletservice.model.Order;
import com.walletService.paymentwalletservice.model.ShippingInput;
import com.walletService.paymentwalletservice.model.ShippngCart;

public class ShippingCartFeignClientFallback implements ShippingCartFeignClient{
	
	private static final Logger logger = LoggerFactory.getLogger(ShippingCartFeignClientFallback.class);

	@Override
	public ShippngCart getShippingDetails(ShippingInput shinnpingInput) {
		logger.info("ShippingCartServicefallback: ShippingCart service is down");
		return null;
	}

	@Override
	public Order notifyOrder(Order order) {
		logger.info("ShippingCartServicefallback: ShippingCart service is down");
		return null;
	}

}
