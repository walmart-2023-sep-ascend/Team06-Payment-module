package com.walletService.paymentwalletservice.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.walletService.paymentwalletservice.model.InputData;
import com.walletService.paymentwalletservice.model.ResponseData;
import com.walletService.paymentwalletservice.model.Users;
import com.walletService.paymentwalletservice.service.WalletService;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PaymentControllerTest {

	@InjectMocks
	PaymentController paymentController;

	@Mock
	WalletService walletService;

	@Test
	public void testshow() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		String responseEntity = paymentController.show();

		assertThat(responseEntity).isEqualTo("Welcome to Payment Wallet Service appln");

		assertEquals("Welcome to Payment Wallet Service appln", responseEntity);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testuserInfo() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		ResponseEntity<ResponseData> responseEntity = null;
		ResponseData responseData=new ResponseData();
		responseData.setUserId(1234);
		
		Optional<Users> user = Optional.of(new Users());
		user.get().setWallet(1000);
		user.get().setUserId(1234);

		
		InputData inputData = new InputData();
		inputData.setAmount(1000);
		inputData.setTotalAmount(200);
		inputData.setUserId(1234);
		//when(walletService.getUserInfo(anyInt())).thenReturn(user);
		
		try {
			responseEntity = (ResponseEntity<ResponseData>) paymentController.userInfo(inputData);
		} catch (Exception e) {
		}
		assertEquals("200 OK",responseEntity.getStatusCode().toString());
		//assertEquals(1234, responseEntity.getBody().getUserId());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testvalidateWalletInfo() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		ResponseData responseData=new ResponseData();
		responseData.setUserId(39432);
		
		InputData inputData = new InputData();
		inputData.setAmount(800);
		inputData.setTotalAmount(300);
		inputData.setUserId(39432);
		//when(paymentController.userInfo(any(InputData.class))).thenReturn(responseData);
		ResponseEntity<ResponseData> responseEntity = null;
		try {
			responseEntity = (ResponseEntity<ResponseData>) paymentController.validateWalletInfo(inputData);
		} catch (Exception e) {
		}
		assertEquals("200 OK",responseEntity.getStatusCode().toString());
		assertEquals(39432, responseData.getUserId());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testwalletAuthentication() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		ResponseData responseData=new ResponseData();
		responseData.setUserId(39432);
		
		InputData inputData = new InputData();
		inputData.setAmount(800);
		inputData.setTotalAmount(300);
		inputData.setUserId(39432);
		//when(paymentController.walletAuthentication(any(InputData.class))).thenReturn(responseData);
		ResponseEntity<ResponseData> responseEntity = null;
		try {
			responseEntity = (ResponseEntity<ResponseData>) paymentController.walletAuthentication(inputData);
		} catch (Exception e) {
		}
		assertEquals("200 OK",responseEntity.getStatusCode().toString());
		assertEquals(39432, responseData.getUserId());
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testotpValidation() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		ResponseData responseData=new ResponseData();
		responseData.setUserId(39432);
		
		InputData inputData = new InputData();
		inputData.setAmount(800);
		inputData.setTotalAmount(300);
		inputData.setUserId(39432);
		//when(paymentController.walletAuthentication(any(InputData.class))).thenReturn(responseData);
		ResponseEntity<ResponseData> responseEntity = null;
		try {
			responseEntity = (ResponseEntity<ResponseData>) paymentController.otpValidation(inputData);
		} catch (Exception e) {
		}
		assertEquals("200 OK",responseEntity.getStatusCode().toString());
		assertEquals(39432, responseData.getUserId());
	}
	
	
	
	
}
