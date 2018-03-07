package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.entities.Event;
import com.revature.util.SessionUtil;

public class EventHib implements EventDao {
	private Logger log = Logger.getRootLogger();
	private SessionUtil su = SessionUtil.getSessionUtil();

	@Override
	public Event save(Event e) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		int id = (int) se.save(e); // e is now a persistent object
		tx.commit();
		se.close();
		return e;
	}

	@Override
	public Event getById(int id) {
		Session se = su.getSession();
		Event e = (Event) se.get(Event.class, id);
		se.close();
		return e;
	}

	@Override
	public Event merge(Event e) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		Event persistant = (Event) se.merge(e);
		tx.commit();
		se.close();
		return persistant;
	}

	@Override
	public ArrayList<Event> findByTypeHQL(int type) {
		Session se = su.getSession();
		String hql = "FROM Event WHERE type_id LIKE ?";
		Query q = se.createQuery(hql);
		q.setInteger(1, type);
		List<Event> events = q.list();
		se.close();
		return new ArrayList<>(events);
	}

	@Override
	public ArrayList<Event> findByGenreHQL(int genre) {
		Session se = su.getSession();
		String hql = "FROM Event WHERE genre_id LIKE ?";
		Query q = se.createQuery(hql);
		q.setInteger(1, genre);
		List<Event> events = q.list();
		se.close();
		return new ArrayList<>(events);
	}

	@Override
	public ArrayList<Event> findByCityHQL(String city) {
		Session se = su.getSession();
		String hql = "FROM Event WHERE address LIKE ?";
		Query q = se.createQuery(hql);
		q.setString(1, "%" + city + "%");
		List<Event> events = q.list();
		se.close();
		return new ArrayList<>(events);
	}

}
