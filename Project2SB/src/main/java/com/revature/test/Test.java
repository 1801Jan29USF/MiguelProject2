package com.revature.test;

import org.hibernate.HibernateException;

import com.revature.entities.Address;
import com.revature.entities.Role;
import com.revature.entities.User;

public class Test {

	public static void main(String[] args) {

		Address address = new Address("30455 Woodhaven", "Beverly Hills", "Michigan", "48025");
		Role role = new Role(0, "Host");

		User user1 = new User(0, role, address, "ian", "perfitt", "i", "i", "I love music", "iperfitt@umich.edu",
				"2484034694");
		User user2 = new User(0, role, address, "john", "perfitt", "j", "j", "I love music", "jperfitt@umich.edu",
				"2484034695");

	}
}
