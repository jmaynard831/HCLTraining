package com.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtility {

	
	private static SessionFactory sf;
	
	static {
		sf = new Configuration().configure().buildSessionFactory();
		
	}
	
	public static Session getSession() {
		Session session = sf.openSession();
		return session;
	}
	
}
