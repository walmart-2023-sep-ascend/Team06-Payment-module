package com.walletService.paymentwalletservice.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;

import com.walletService.paymentwalletservice.model.EmailDetails;

public class EmailFeignClientFallback implements EmailFeignClient{

	private static final Logger logger = LoggerFactory.getLogger(EmailFeignClientFallback.class);
	
	@Override
	public ResponseEntity<String> sendEmail(EmailDetails emailDetails) {
		logger.info("EmailServicefallback: Email service is down");
		return null;
	}

}
