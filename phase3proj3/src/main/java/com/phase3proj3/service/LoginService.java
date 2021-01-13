package com.phase3proj3.service;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.stereotype.Service;

import com.phase3proj3.model.User;

@Service
public class LoginService {
	public static Set<User> userList = new HashSet<>();

	public static User loggedInUser = null;
	
	public boolean login(String username, String password) {
		AtomicBoolean userExists = new AtomicBoolean(false);
		
		userList.stream().filter(x -> x.getUsername().equals(username) && x.getPassword().equals(password))
				.findFirst().ifPresent(x->{userExists.set(true); loggedInUser=x;}); 
	
		return userExists.get();	
	}
	
	public void logout() {
		loggedInUser = null;
	}

	public User getLoggedInUser() {
		return loggedInUser;
	}
	
	static {
		userList.add(User.builder().username("Jake").password("hellow0rld").build());
		userList.add(User.builder().username("Diego").password("satellite").build());
		userList.add(User.builder().username("Admin").password("123").build());
		userList.add(User.builder().username("Evan").password("sarcophagus").build());

	}

}
