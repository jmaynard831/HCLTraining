package com.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	public boolean registration(String uname, String pass) {
		userdao.save(new User(uname, pass));
		return true;
	}

	public boolean userUpdate(User newUser) {
		try {
			userdao.save(newUser);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
			return false;
		}
		// System.out.println("Saving failed");
		// return false;
	}

	public User userSearch(int userID) {
		try {
			User u = userdao.findById(userID).get();

			if (u != null) {
				return u;
			}
		} catch (NoSuchElementException e) {
			return null;
		}

		return null;
	}

	public List<User> getNames() {
		return (List<User>) userdao.findAll();
	}

}
