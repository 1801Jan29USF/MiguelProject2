package com.revature.services;

import com.revature.entities.User;

public interface RegisterService {

	User save(User u);

	User findByUsername(User u);

}
