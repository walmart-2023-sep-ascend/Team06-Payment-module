package com.walletService.paymentwalletservice;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walletService.paymentwalletservice.email.EmailService;
import com.walletService.paymentwalletservice.exception.UserNotFoundException;
import com.walletService.paymentwalletservice.model.EventCodeLog;
import com.walletService.paymentwalletservice.model.InputData;
import com.walletService.paymentwalletservice.model.ResponseData;
import com.walletService.paymentwalletservice.model.ShippngCart;
import com.walletService.paymentwalletservice.model.Users;
import com.walletService.paymentwalletservice.repository.ShippngCartRepository;
import com.walletService.paymentwalletservice.repository.UserRepository;
import com.walletService.paymentwalletservice.repository.WalletRepository;

@Service
public class WalletServiceImpl implements WalletService{
	
	Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);
	
	@Autowired
	WalletRepository walletRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ShippngCartRepository shippngCartRepository;

	@Autowired
	EmailService emailService;

	public Optional<Users> getUserInfo(int id) throws Exception {
		Optional<Users> user=null;
		try {
			logger.info("Log level: INFO : getting Customer Info");
			user = userRepository.findByuserId(id);
		} catch (Exception e) {
			logger.error("Log level: INFO : exception occured while getting Customer Info");
			throw new Exception(new UserNotFoundException());
		}

		return user;
	}

	public ResponseData validateWalletInfo(InputData inputData) throws Exception {
		logger.info("Log level: INFO : starting of ValidateWalletInfo ");
		ResponseData responseData = null;
		Optional<Users> user = null;
		try {
			user = getUserInfo(inputData.getUserId());
			if (user.get().getWallet() >= inputData.getTotalAmount()) {
				responseData = new ResponseData();
				responseData.setResponsecode("200");
				responseData.setUserId(inputData.getUserId());
				responseData.setWalletAmount(user.get().getWallet());
				responseData.setMessage("Wallet validation successful. The user has sufficient funds");
			} else {
				responseData = new ResponseData();
				responseData.setResponsecode("403");
				responseData.setUserId(inputData.getUserId());
				responseData.setWalletAmount(user.get().getWallet());
				responseData.setMessage("Wallet validation failed. The user does not have sufficient funds");
			}
		} catch (Exception e) {
			logger.error("Log level: INFO : exception occured while validating  Customer Wallet");
			throw new Exception(new UserNotFoundException());
		}

		return responseData;
	}

	public ResponseData validateWalletAuthentication(InputData inputData) throws Exception {
		ResponseData responseData = new ResponseData();
		try {

			EventCodeLog eventCodeLog = new EventCodeLog();
			eventCodeLog.setUserId(inputData.getUserId());
			int otp = otpGenerator();
			Optional<Users> user = getUserInfo(inputData.getUserId());
			emailService.sendEmail(user.get().getEmail(), otp, "Wallet Authentication OTP");
			eventCodeLog.setEventId(otp);
			//LocalDateTime date = LocalDateTime.now();
			eventCodeLog.setEventEntryTimeStamp(LocalDateTime.now());
			eventCodeLog.setEventExpiryTimeStamp(LocalDateTime.now().plusMinutes(2));
			walletRepository.save(eventCodeLog);
			responseData.setResponsecode("200");
			responseData.setUserId(inputData.getUserId());
			responseData.setMessage("OTP Sent successfully");
		} catch (Exception e) {
			logger.error("Log level: INFO : exception occured while validating  Customer Wallet");
			throw new Exception("Exception occured while Sending OTP to Email"+e.getMessage());
		}
		return responseData;

	}

	private static int otpGenerator() {
		int length = 5;
		String numbers = "1234567890";
		Random random = new Random();
		char[] otp = new char[length];

		for (int i = 0; i < length; i++) {
			otp[i] = numbers.charAt(random.nextInt(numbers.length()));
		}
		return Integer.parseInt(new String(otp));

	}

	public ResponseData validateOTP(InputData inputData) throws Exception {
		long noOfMinutes = 0;
		Optional<EventCodeLog> eventCodeLog = null;
		ResponseData responseData = new ResponseData();
		responseData.setUserId(inputData.getUserId());
		try {
			logger.info("Log level: INFO : getting Customer Info");
			eventCodeLog = walletRepository.findByeventId(inputData.getOtp());
			if (eventCodeLog.isPresent()) {
				EventCodeLog eventCode = eventCodeLog.get();
				LocalDateTime dateBefore = eventCode.getEventExpiryTimeStamp();
				noOfMinutes = dateBefore.until(LocalDateTime.now(), ChronoUnit.MINUTES);
			}

			if (noOfMinutes <= 2) {
				responseData.setAuthenticated(true);
				responseData.setMessage("Authentication successful. User has been authenticated with OTP");
			} else {
				responseData.setAuthenticated(false);
				responseData.setMessage("Authentication failed.");
			}
		} catch (Exception e) {
			logger.error("Log level: INFO : exception occured while validating  Customer Wallet");
			throw new Exception("Exception occured while getting the Customer Info");
		}
		return responseData;
	}

	public ResponseData getPayableAmount(InputData inputData) throws Exception {
		double totalAmount = 0;
		ResponseData responseData = new ResponseData();
		try {
		Optional<ShippngCart> shippngCart = shippngCartRepository.findBycartId(inputData.getCartId());
		if (shippngCart.isPresent()) {
			responseData.setUserId(inputData.getUserId());
			totalAmount = inputData.getAmount() + shippngCart.get().getShippingCost();
			responseData.setTotalAmount(totalAmount);
		}
		}catch (Exception e) {
			logger.error("Log level: INFO : Exception occured while getting shippingCost Details !!");
			throw new Exception ("Exception occured while getting shippingCost " +e.getMessage());
		}
		return responseData;
	}

	public ResponseData updateWallet(InputData inputData) throws Exception {
		double totalAmount = 0;
		ResponseData responseData = new ResponseData();
		try {
			responseData.setUserId(inputData.getUserId());
			responseData.setCartId(inputData.getCartId());
			logger.info("Log level: INFO : calling shoppingCart ");
			Optional<ShippngCart> shippngCart = shippngCartRepository.findBycartId(inputData.getCartId());
			if (shippngCart.isPresent()) {
				responseData.setDestinationOfShipping(shippngCart.get().getDestinationOfShipping());
				responseData.setTypeOfShipping(shippngCart.get().getTypeOfShipping());

				totalAmount = inputData.getTotalAmount() + shippngCart.get().getShippingCost();
				responseData.setTotalAmount(totalAmount);
				responseData.setResponsecode("200");

				LocalDateTime date = LocalDateTime.now();
				LocalDateTime localdate = date.plusDays(shippngCart.get().getDeliveryDuration());
				Instant instant = localdate.atZone(ZoneId.systemDefault()).toInstant();
				responseData.setDeliverydate(Date.from(instant));

				// update Wallet
				Optional<Users> userInfo = userRepository.findByuserId(inputData.getUserId());
				if (userInfo.isPresent()) {
					double wallet = userInfo.get().getWallet() - totalAmount;
					int result = userRepository.updateWallet(inputData.getUserId(), (float) wallet);
					if (result == 1)
					 responseData.setMessage("Payment Successful. Wallet amount has been deducted");
				}
			}
		} catch (Exception e) {
			logger.error("Log level: INFO : exception occured while while updating the Wallet Amount");
			throw new Exception("Exception occured while updating the Wallet Amount "+e.getMessage());
		}
		return responseData;
	}

	@Override
	public ResponseData getShippingDetails(InputData inputData) throws Exception {
		double totalAmount = 0;
		ResponseData responseData = new ResponseData();
		try {
			responseData.setUserId(inputData.getUserId());
			responseData.setCartId(inputData.getCartId());
			logger.error("Log level: INFO : Fetching ShippingCart details");
			Optional<ShippngCart> shippngCart = shippngCartRepository.findBycartId(inputData.getCartId());
			if (shippngCart.isPresent()) {
				responseData.setDestinationOfShipping(shippngCart.get().getDestinationOfShipping());
				responseData.setTypeOfShipping(shippngCart.get().getTypeOfShipping());

				totalAmount = inputData.getTotalAmount() + shippngCart.get().getShippingCost();
				responseData.setTotalAmount(totalAmount);
				responseData.setResponsecode("200");

				LocalDateTime date = LocalDateTime.now();
				LocalDateTime localdate = date.plusDays(shippngCart.get().getDeliveryDuration());
				Instant instant = localdate.atZone(ZoneId.systemDefault()).toInstant();
				responseData.setDeliverydate(Date.from(instant));
				responseData.setMessage("Payment will be done during delivery of the order");
			}
		} catch (Exception e) {
			logger.error("Log level: INFO : exception occured while getting Shipping Details");
			throw new Exception("Exception occured while getting Shipping Details "+e.getMessage());
		}
		return responseData;
	}
	
}
