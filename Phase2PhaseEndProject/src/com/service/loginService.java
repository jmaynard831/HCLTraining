package com.service;

import java.util.List;

import org.hibernate.Session;

import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;
import com.utility.HibernateUtility;

public class loginService implements UserDao {

	@Override
	public boolean registration(Registration reg) {
		return false;
	}

	@Override
	public boolean login(Login log) {
		String name = log.getUsername();
		String email = log.getEmail();

		try {
			Session session = HibernateUtility.getSession();

			List<Registration> list = session
					.createQuery("FROM Registration u where u.uname='" + name + "' and u.email='" + email + "'",
							Registration.class)
					.getResultList();

			System.out.println(list);
			if (list.size() > 0) {
				return true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return false;

	}

}
