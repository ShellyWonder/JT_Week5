package com.wonderwebdev;

public class User {
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	/*
	 * 1. Create a User POJO that has a username, password and name. All Strings.*/
	  private String username;
	  private String password;
	  private String name;
	  
	  
}
