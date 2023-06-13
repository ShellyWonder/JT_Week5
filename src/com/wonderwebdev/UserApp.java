package com.wonderwebdev;

public class UserApp {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User user = userService.createUser("JDoe@mailinator.com","Abc&123!", "Joe");
		System.out.println(user);
	}

}
