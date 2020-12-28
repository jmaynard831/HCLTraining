package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.model.Login;
import com.model.Registration;
import com.utility.HibernateUtility;

public class UserService implements UserDao {


	@Override
	public boolean registration(Registration reg) {

		try {
			Session session = HibernateUtility.getSession();
			Transaction trnx = session.beginTransaction();
			session.save(reg);
			trnx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean login(Login log) {
		// TODO Auto-generated method stub
		return false;
	}

}
