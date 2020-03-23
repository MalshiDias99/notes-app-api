package com.example.demo.model;

import org.apache.commons.codec.digest.DigestUtils;

public class UserModel {
	
	private String email;
	private String password;
	
	
	public UserModel() {
		super();
	}


	public UserModel(String email,String password ) {
		super();
		this.email = email;
		String sha256hex = DigestUtils.sha256Hex(password);
		System.out.println("123");
		System.out.println(sha256hex);
		this.password = sha256hex;
		
	}




	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		String sha256hex = DigestUtils.sha256Hex(password);
		System.out.println("123");
		System.out.println(sha256hex);
		this.password = sha256hex;
	}


	
	

}
