package com.revature.dao;

import com.revature.entities.User;

public interface UserDao {
	// C
	User save(User u);

	// R
	User getById(int id);

	User loadById(int id);

	// D
	User merge(User b);

}
