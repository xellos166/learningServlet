package com.aredent.demo.jsp.bean;

import java.io.Serializable;

public class User implements Serializable {
	public User() {

	}

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setUserName called");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setPassword called");
		this.password = password;
	}

}
