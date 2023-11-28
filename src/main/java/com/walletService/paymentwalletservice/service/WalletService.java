package com.walletService.paymentwalletservice.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.walletService.paymentwalletservice.model.InputData;
import com.walletService.paymentwalletservice.model.InventoryResponse;
import com.walletService.paymentwalletservice.model.Order;
import com.walletService.paymentwalletservice.model.ResponseData;
import com.walletService.paymentwalletservice.model.Users;


public interface WalletService {
	
	ResponseData updateWallet(InputData inputData) throws Exception;

	ResponseData getShippingDetails(InputData inputData) throws Exception;

	ResponseData validateOTP(InputData inputData) throws Exception;

	ResponseData validateWalletAuthentication(InputData inputData) throws Exception;

	ResponseData validateWalletInfo(InputData inputData) throws Exception;

	Optional<Users> getUserInfo(int id) throws Exception;

	ResponseData getPayableAmount(InputData inputData) throws Exception;

	String sendEmailForOrderConfirmation(Order body, InventoryResponse body2);

	ResponseData orderUpdate(Order order);

	ResponseEntity<InventoryResponse> inventoryUpdate(int cartid);


}
