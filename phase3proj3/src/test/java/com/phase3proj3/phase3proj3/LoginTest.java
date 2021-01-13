package com.phase3proj3.phase3proj3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.phase3proj3.model.User;
import com.phase3proj3.service.LoginService;

public class LoginTest {

	@BeforeEach
	public void setUserList() {
		LoginService.userList.add(User.builder().username("Jake").password("hellow0rld").build());
		LoginService.userList.add(User.builder().username("Diego").password("satellite").build());
		LoginService.userList.add(User.builder().username("Admin").password("123").build());
		LoginService.userList.add(User.builder().username("Evan").password("sarcophagus").build());

	}

	@AfterEach
	public void logoutUser() {
		LoginService lg = new LoginService();
		lg.logout();
	}

	@Test
	public void testSuccessLogin() {
		LoginService lg = new LoginService();
		assertEquals(true, lg.login("Admin", "123"));
	}

	@Test
	public void testInvalidUsername() {
		LoginService lg = new LoginService();
		assertEquals(false, lg.login("FakeName", "123"));
	}

	@Test
	public void testInvalidPassword() {
		LoginService lg = new LoginService();
		assertEquals(false, lg.login("Jake", "notapassword"));
	}

	@Test
	public void testSuccessLoggedInUser() {
		LoginService lg = new LoginService();
		assertEquals(true, LoginService.loggedInUser == null);
		assertEquals(true, lg.login("Jake", "hellow0rld"));
		assertEquals(true, LoginService.loggedInUser != null);
		assertEquals(true,
				LoginService.loggedInUser.equals(LoginService.userList.stream()
						.filter(x -> x.getUsername().equals("Jake") && x.getPassword().equals("hellow0rld")).findFirst()
						.get()));
	}

	@Test
	public void testFailLoggedInUser() {
		LoginService lg = new LoginService();
		assertEquals(true, LoginService.loggedInUser == null);
		assertEquals(false, lg.login("No one", "hellow0rld"));
		assertEquals(true, LoginService.loggedInUser == null);
	}

	@Test
	public void testLogout() {
		LoginService lg = new LoginService();
		assertEquals(true, LoginService.loggedInUser == null);
		assertEquals(true, lg.login("Jake", "hellow0rld"));
		assertEquals(false, LoginService.loggedInUser == null);
		assertEquals(true,
				LoginService.loggedInUser.equals(LoginService.userList.stream()
						.filter(x -> x.getUsername().equals("Jake") && x.getPassword().equals("hellow0rld")).findFirst()
						.get()));
		lg.logout();
		assertEquals(true, LoginService.loggedInUser == null);
		
		
		
	}

}
