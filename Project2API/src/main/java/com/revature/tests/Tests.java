package com.revature.tests;

import org.apache.log4j.Logger;

import com.revature.dao.UserDao;
import com.revature.dao.UserHib;
import com.revature.entities.User;
import com.revature.util.SessionUtil;

public class Tests {
	private static Logger log = Logger.getRootLogger();

	private static UserHib udao = new UserHib();

	private static SessionUtil su = SessionUtil.getSessionUtil();

	public static void main(String[] args) {

		User user = new User(0, "ian", "perfitt", "ian", "perfitt", "2919 Network Pl, Lutz, FL 33333", "I love music",
				"ianperfitt@gmail.com", "2484034694");

		udao.save(user);
	}

}
