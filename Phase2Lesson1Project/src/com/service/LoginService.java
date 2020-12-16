package com.service;

import com.dao.UserDao;
import com.model.Login;

public class LoginService implements UserDao {

	@Override
	public boolean login(Login login) {
		String correctUserName = "Jake";
		String correctPassword = "123";

		if (login.getUsername().equals(correctUserName) && login.getPassword().equals(correctPassword)) {
			return true;
		}
		else {
			return false;
		}

	}

}
