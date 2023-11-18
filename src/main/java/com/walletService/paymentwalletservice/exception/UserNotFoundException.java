package com.walletService.paymentwalletservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.CONFLICT, reason="CustomerId not found")
public class UserNotFoundException extends Exception {

}
