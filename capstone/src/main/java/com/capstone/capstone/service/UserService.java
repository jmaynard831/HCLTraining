package com.capstone.capstone.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.capstone.dao.UserDao;
import com.capstone.capstone.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;

	// Save user to DB
	public boolean saveUser(User u) {
		try {
			userdao.save(u);
			return true;
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return false;

	}

	// retrieve user from db
	public User getUser(UUID user_id) {
		try {
			return userdao.findById(user_id).get();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	public User login(User u) {
		try {
		List<User> userlist = (List<User>) userdao.findAll();

		User match = userlist.stream()
				.filter(x -> x.getUsername().equals(u.getUsername()) && x.getPassword().equals(u.getPassword()))
				.findFirst().get();
		
		return match;
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
