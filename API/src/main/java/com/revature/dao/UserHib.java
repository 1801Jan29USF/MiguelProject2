package com.revature.dao;

import org.apache.log4j.Logger;

import com.revature.entities.User;
import com.revature.util.SessionUtil;

public class UserHib implements UserDao {
	private Logger log = Logger.getRootLogger();
	private SessionUtil su = SessionUtil.getSessionUtil();
	
	
	public User save(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public User save(User u) {
	// Session se = su.getSession();
	// Transaction tx = se.beginTransaction();
	// int id = (int) se.save(u); // b is now a persistent object
	// log.trace("The generated id is: " + id);
	//
	// tx.commit();
	// se.close();
	// return u;
	// }

	// @Override
	// public user persist(user b) {
	// Session se = su.getSession();
	// Transaction tx = se.beginTransaction();
	// se.persist(b); // b is now a persistent object
	// log.trace("The generated id is: " + b.getuserId());
	// // b.setuserColor("Silver"); // this should be reflected in the db
	//
	// tx.commit();
	// se.close();
	// return b;
	// }
	//
	// @Override
	// public user getById(int id) {
	// Session se = su.getSession();
	// user b = (user) se.get(user.class, id);
	// se.close();
	// return b;
	// }
	//
	// @Override
	// public user loadById(int id) {
	// Session se = su.getSession();
	// user b = (user) se.load(user.class, id);
	// b.getuserId(); // accessing a field will retreive the proxy
	// se.close();
	// return b;
	// }
	//
	// @Override
	// public List<user> getAll() {
	// Session se = su.getSession();
	// Criteria c = se.createCriteria(user.class);
	// List<user> users = c.list();
	// se.close();
	// return users;
	// }
	//
	// @Override
	// public user update(user b) {
	// Session se = su.getSession();
	// Transaction tx = se.beginTransaction();
	//
	// // this will cause us to get the non unique object exception
	// // user b2 = loadById(b.getuserId());
	// // se.update(b2);
	//
	// se.update(b); // b is now a persistent object
	//
	// tx.commit();
	// se.close();
	// log.info("done");
	// return b;
	// }
	//
	// @Override
	// public user merge(user b) {
	// Session se = su.getSession();
	// Transaction tx = se.beginTransaction();
	//
	// user persistant = (user) se.merge(b);
	//
	// // user b2 = loadById(b.getuserId());
	// // se.update(b2);
	// // log.info("b2 weight: " + b2.getWeight());
	// //
	// // user persistant = (user) se.merge(b);
	// // log.info("b2 weight after merge: " + b2);
	// // log.info(b2 == persistant);
	//
	// tx.commit();
	// se.close();
	// log.info("done");
	// return persistant;
	// }
	//
	// @Override
	// public void delete(user b) {
	// Session se = su.getSession();
	// Transaction tx = se.beginTransaction();
	//
	// se.delete(b); // b is now a persistent object
	//
	// tx.commit();
	// se.close();
	// }
	//
	// @Override
	// public Set<user> findByBreedCriteria(String breed) {
	// Session se = su.getSession();
	// Criteria c = se.createCriteria(user.class);
	// c.add(Restrictions.ilike("breed", breed));
	// List<user> users = c.list();
	// se.close();
	// return new HashSet<>(users);
	// }
	//
	// @Override
	// public Set<user> findByBreedHQL(String breed) {
	// Session se = su.getSession();
	// String hql = "FROM user WHERE UPPER(breed) = UPPER(:breed)";
	// Query q = se.createQuery(hql);
	// q.setParameter("breed", breed);
	// List<user> users = q.list();
	// se.close();
	// return new HashSet<>(users);
	// }

}
