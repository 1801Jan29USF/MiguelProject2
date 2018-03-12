package com.revature.services;

import com.revature.entities.User;

public interface RegisterService {

	User save(User u);

	String register(User u);

}
