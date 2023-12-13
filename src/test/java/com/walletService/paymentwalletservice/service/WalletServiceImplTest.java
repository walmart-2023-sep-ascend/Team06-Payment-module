package com.walletService.paymentwalletservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.walletService.paymentwalletservice.email.EmailService;
import com.walletService.paymentwalletservice.repository.UserRepository;
import com.walletService.paymentwalletservice.repository.WalletRepository;
import com.walletService.paymentwalletservice.model.EventCodeLog;
import com.walletService.paymentwalletservice.model.InputData;
import com.walletService.paymentwalletservice.model.ResponseData;
import com.walletService.paymentwalletservice.model.ShippngCart;
import com.walletService.paymentwalletservice.model.Users;

@ExtendWith(MockitoExtension.class)
public class WalletServiceImplTest {
/*
	@InjectMocks
	WalletServiceImpl walletServiceImpl;

	@Mock
	EmailService emailService;

	@Mock
	UserRepository userRepository;

	@Mock
	WalletRepository walletRepository;

	@Test
	void testgetUserInfo() throws Exception {
		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(1234);
		user.get().setEmail("abc@walmart.com");

		when(userRepository.findByuserId(any())).thenReturn(user);

		Optional<Users> userList = walletServiceImpl.getUserInfo(41231);

		assertEquals(1234, userList.get().getUserId());
		assertEquals("abc@walmart.com", userList.get().getEmail());

	}

	@Test
	void testvalidateWalletInfo() throws Exception {
		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(1234);

		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(200);
		inputData.setUserId(1234);

		when(userRepository.findByuserId(any())).thenReturn(user);

		ResponseData responseData = walletServiceImpl.validateWalletInfo(inputData);

		assertEquals(1234, responseData.getUserId());
		assertEquals(1000, responseData.getWalletAmount());

	}

	@Test
	void testvalidateWalletAuthentication() throws Exception {
		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(45321);

		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(200);
		inputData.setUserId(45321);

		when(userRepository.findByuserId(any())).thenReturn(user);

		ResponseData responseData = walletServiceImpl.validateWalletAuthentication(inputData);

		assertEquals(45321, responseData.getUserId());
		assertEquals("OTP Sent successfully", responseData.getMessage());

	}

	@Test
	void testvalidateOTP() throws Exception {
		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(45321);

		Optional<EventCodeLog> eventCodeLog = Optional.of(new EventCodeLog());
		eventCodeLog.get().setUserId(45321);
		eventCodeLog.get().setEventExpiryTimeStamp(LocalDateTime.now().plusMinutes(2));
		// LocalDateTime.now().plusMinutes(2)

		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(200);
		inputData.setUserId(45321);

		when(walletRepository.findByeventId(any())).thenReturn(eventCodeLog);

		ResponseData responseData = walletServiceImpl.validateOTP(inputData);

		assertEquals(45321, responseData.getUserId());
		assertEquals("Authentication successful. User has been authenticated with OTP", responseData.getMessage());

	}

	@Test
	void testgetPayableAmount() throws Exception {
		Optional<ShippngCart> shippngCart = Optional.of(new ShippngCart());
		shippngCart.get().setCartId(56789);
		shippngCart.get().setShippingCost(10.0);

		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(200);
		inputData.setUserId(45321);
		inputData.setCartId(56789);

		//when(shippngCartRepository.findBycartId(any())).thenReturn(shippngCart);

		ResponseData responseData = walletServiceImpl.getPayableAmount(inputData);

		assertEquals(45321, responseData.getUserId());
		assertEquals(1010.0, responseData.getTotalAmount());

	}

	@Test
	void testupdateWallet() throws Exception {
		Optional<ShippngCart> shippngCart = Optional.of(new ShippngCart());
		shippngCart.get().setCartId(56789);
		//shippngCart.get().setShippingCost(10.0);

		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(45321);

		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(210);
		inputData.setUserId(45321);
		inputData.setCartId(56789);

		//when(shippngCartRepository.findBycartId(any())).thenReturn(shippngCart);

		when(userRepository.findByuserId(any())).thenReturn(user);

		ResponseData responseData = walletServiceImpl.updateWallet(inputData);

		assertEquals(45321, responseData.getUserId());
		assertEquals(210.0, responseData.getTotalAmount());
		assertEquals(56789, responseData.getCartId());

	}
	
		
	@Test
	void testgetShippingDetails() throws Exception {
		Optional<ShippngCart> shippngCart = Optional.of(new ShippngCart());
		shippngCart.get().setCartId(56789);
		//shippngCart.get().setShippingCost(10.0);

		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(45321);
		user.get().setPhone("9949595959");

		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(210);
		inputData.setUserId(45321);
		inputData.setCartId(56789);

		//when(shippngCartRepository.findBycartId(any())).thenReturn(shippngCart);
		when(userRepository.findByuserId(any())).thenReturn(user);

		ResponseData responseData = walletServiceImpl.getShippingDetails(inputData);

		assertEquals(45321, responseData.getUserId());
		assertEquals(210.0, responseData.getTotalAmount());
		assertEquals(56789, responseData.getCartId());
		assertEquals("9949595959",responseData.getPhone());
		//assertEquals("Payment will be done during delivery of the order", responseData.getMessage());

	}
*/
}
