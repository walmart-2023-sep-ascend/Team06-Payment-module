package com.walletService.paymentwalletservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Users")
public class Users {
	
	private int userId;
	private String userName;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", email=" + email + ", wallet=" + wallet + "]";
	}
	
	
	
		
}
