package com.walletService.paymentwalletservice;

import java.util.Optional;

import com.walletService.paymentwalletservice.model.InputData;
import com.walletService.paymentwalletservice.model.ResponseData;
import com.walletService.paymentwalletservice.model.Users;


public interface WalletService {
	
	ResponseData updateWallet(InputData inputData) throws Exception;;

	ResponseData getShippingDetails(InputData inputData) throws Exception;;

	ResponseData validateOTP(InputData inputData) throws Exception;;

	ResponseData validateWalletAuthentication(InputData inputData) throws Exception;;

	ResponseData validateWalletInfo(InputData inputData) throws Exception;;

	Optional<Users> getUserInfo(int id) throws Exception;

	ResponseData getPayableAmount(InputData inputData) throws Exception;;


}
