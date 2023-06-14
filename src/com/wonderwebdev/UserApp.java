package com.wonderwebdev;

public class UserApp {

	public static void main(String[] args) {
		UserService userService = new UserService();
		User user = userService.createUser("JDoe@mailinator.com","Abc&123!", "Joe");
		String[]parsedValues = userService.parseText("JaneD@mailinator.com,123&Abc?,Jane");
		System.out.println(user);
		System.out.println(parsedValues);
		
	}

}
