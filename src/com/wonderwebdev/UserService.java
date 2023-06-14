package com.wonderwebdev;

public class UserService {

	public User createUser(String username, String password, String name) {
		User user = new User(username, password, name);
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);

		return user;

	}

	public String[] parseText(String input) {
		// return an array of Strings with three elements inside
           String[] parsedValues = input.split(",");
          return parsedValues;
		
          }
}