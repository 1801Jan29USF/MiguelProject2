package com.revature.services;

import com.revature.dto.DTO;
import com.revature.entities.User;

public interface LoginService {
	

	User findByCredentials(DTO credential);
}
