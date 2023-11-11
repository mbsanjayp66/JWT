package com.sanjay.jwt.JwtExample.model;

public class User {
	
	private  String userId;
	private String name;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return name;
	}

	public void setUserName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	
}
