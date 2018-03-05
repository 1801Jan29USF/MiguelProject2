package com.revature.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.entities.User;
import com.revature.util.SessionUtil;

public class UserHib implements UserDao {
	private Logger log = Logger.getRootLogger();
	private SessionUtil su = SessionUtil.getSessionUtil();

	@Override
	public User save(User u) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		int id = (int) se.save(u); // u is now a persistent object
		log.trace("The generated id is: " + id);
		tx.commit();
		se.close();
		return u;
	}

	// @Override
	// public User persisf(User u) {
	// Session se = su.getSession();
	// Transaction tx = se.beginTransaction();
	// se.persist(u); // u is now a persistent object
	// log.trace("The generated id is: " + u.getUser_id());
	// tx.commit();
	// se.close();
	// return u;
	// }

	@Override
	public User getById(int id) {
		Session se = su.getSession();
		User u = (User) se.get(User.class, id);
		se.close();
		return u;
	}

	@Override
	public User loadById(int id) {
		Session se = su.getSession();
		User u = (User) se.load(User.class, id);
		u.getUser_id(); // accessing a field will retreive the proxy
		se.close();
		return u;
	}

	@Override
	public User merge(User u) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		User persistant = (User) se.merge(u);
		tx.commit();
		se.close();
		return persistant;
	}

}
