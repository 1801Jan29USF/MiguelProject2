package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionUtil {

	private static SessionUtil su = new SessionUtil();
	private SessionFactory sf;
	{
		// represents an entire set of mappings of an application's Java types to an SQL
		// database.Used to build an immutable org.hibernate.SessionFactory.
		Configuration conf = new Configuration().configure();
		
		//read configuration from hibernate xml and build Service Registry
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties())
				.build();
		
		//build the session factory
		sf = conf.buildSessionFactory(serviceRegistry);
	}

	private SessionUtil() {
		super();
	}

	public static SessionUtil getSessionUtil() {
		return su;
	}

	public Session getSession() {
		return sf.openSession();
	}

}
