package com.walletService.paymentwalletservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Users")
public class Users {
	
	private int userId;
	private String email;
	private float wallet;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getWallet() {
		return wallet;
	}
	public void setWallet(float wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "User [ userId=" + userId + ", email=" + email + ", wallet=" + wallet + "]";
	}
	
	
		
}
