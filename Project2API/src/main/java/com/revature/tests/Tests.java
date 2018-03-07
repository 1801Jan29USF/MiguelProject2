package com.revature.tests;

import org.apache.log4j.Logger;

import com.revature.dao.EventHib;
import com.revature.dao.UserHib;
import com.revature.entities.Event;
import com.revature.entities.Genre;
import com.revature.entities.Role;
import com.revature.entities.Type;
import com.revature.entities.User;
import com.revature.util.SessionUtil;

public class Tests {
	private static Logger log = Logger.getRootLogger();

	private static UserHib udao = new UserHib();

	private static EventHib edao = new EventHib();

	private static SessionUtil su = SessionUtil.getSessionUtil();

	public static void main(String[] args) {

		// **ADDING USER SUCCESSFUL**
		// Role role = new Role(0, "HOST");
		// User user = new User(0, role, "ia2en2", "perfiett2", "iaen2", "perfe4itt2",
		// "2919 Net2wqork Pl, Lutz,2 FL 33333",
		// "I love museic2", "ianperefitt2@sgmail.com", "26484e0346924");
		//
		// udao.save(user);

		// // **GET BY ID WORKING
		// User u = udao.getById(12);

		// LOAD BY ID WORKING
		// log.trace("result of loadById" + udao.loadById(12));

		// MERGE BY ID WORKING
//		Role role = new Role(0, "HOST");
//		User b = new User(12, role, "Miguel", "World", "in2", "a", "a", "a", "HelloWorld2@sgmail.com", "a");
		// log.trace("result of mergeById " + udao.merge(b));

		// SAVE EVENT WORKING
//		Type type = new Type(0, "MUSIC");
//		Genre genre = new Genre(0, "ROCK");
//		Event e = new Event(0, "Miguel's Show", "It's gonna rock", "Everywhere", "Feb 1st", 100, "4444444", null, type,
//				null, genre, b);
//		edao.save(e);
		
		//FindByTypeHQL WORKING
//	  log.info(edao.findByTypeHQL(0));

		//FindByGenre WORKING
//		log.info(edao.findByGenreHQL(0));
		
		//FindByCity
		log.info(edao.findByCityHQL("Everywhere"));
	}

}
