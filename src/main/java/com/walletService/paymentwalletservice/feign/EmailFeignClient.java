package com.walletService.paymentwalletservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.walletService.paymentwalletservice.model.EmailDetails;

@FeignClient(name = "email-service", url = "${capstone.emailservice.url}", fallback = EmailFeignClientFallback.class)
public interface EmailFeignClient {

	@PostMapping("/sendMail")
	ResponseEntity<String> sendEmail(@RequestBody EmailDetails emailDetails);
}
