package com.walletService.paymentwalletservice.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.walletService.paymentwalletservice.model.InputData;
import com.walletService.paymentwalletservice.model.Order;
import com.walletService.paymentwalletservice.model.ResponseData;
import com.walletService.paymentwalletservice.model.Users;
import com.walletService.paymentwalletservice.service.WalletService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PaymentController {
	Logger logger = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	WalletService walletService;
	ResponseEntity<?> resentity;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/payment")
	public String show() {
		return "Welcome to Payment Wallet Service appln";
	}

	@PostMapping("/payableAmount")
	public ResponseEntity<?> userInfo(@RequestBody InputData inputData) throws Exception {

		ResponseData shippngCart = walletService.getPayableAmount(inputData);
		return new ResponseEntity<>(shippngCart, HttpStatus.OK);

	}

	@GetMapping("/getUserInfo/{id}")
	public ResponseEntity<?> userInfo(@PathVariable("id") int id) throws Exception {

		Optional<Users> user = walletService.getUserInfo(id);
		if (user.isPresent()) {
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@PostMapping("/walletValidation")
	public ResponseEntity<?> validateWalletInfo(@RequestBody InputData inputData) throws Exception {

		ResponseData status = walletService.validateWalletInfo(inputData);
		resentity = new ResponseEntity<>(status, HttpStatus.OK);
		return resentity;
	}

	@PostMapping("/authentication")
	public ResponseEntity<?> walletAuthentication(@RequestBody InputData inputData) throws Exception {

		ResponseData status;
		try {
			status = walletService.validateWalletAuthentication(inputData);
			resentity = new ResponseEntity<>(status, HttpStatus.OK);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return resentity;
	}

	@PostMapping("/otpValidation")
	public ResponseEntity<?> otpValidation(@RequestBody InputData inputData) throws Exception {
		ResponseData status = walletService.validateOTP(inputData);
		resentity = new ResponseEntity<>(status, HttpStatus.OK);
		return resentity;
	}

	@PostMapping("/walletUpdate")
	public ResponseEntity<?> UpdateWallet(@RequestBody InputData inputData) throws Exception {
		ResponseData status = walletService.updateWallet(inputData);
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

	@PostMapping("/orderConfirmation")
	public ResponseEntity<?> OrderConfirmation(@RequestBody Order order) throws Exception {

		ResponseData status = walletService.orderUpdate(order);
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

	@PostMapping("/shippingDetails")
	public ResponseEntity<?> ShippingDetails(@RequestBody InputData inputData) throws Exception {
		ResponseData status = walletService.getShippingDetails(inputData);
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

}
