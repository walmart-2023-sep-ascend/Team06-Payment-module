package com.walletService.paymentwalletservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection="Users")
public class Users {
	
	private int userId;
	private String userName;
	private String email;
	private float wallet;
	private String phone;
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", email=" + email + ", wallet=" + wallet
				+ ", phone=" + phone + "]";
	}
			
}
