package com.revature.services;

import com.revature.entities.User;

public interface LoginService {
	
	User findByUsername(String username);
}
