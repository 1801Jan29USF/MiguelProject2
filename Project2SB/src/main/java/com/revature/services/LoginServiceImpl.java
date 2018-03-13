package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.DTO;
import com.revature.entities.User;
import com.revature.repos.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo lr;

	@Override
	public User findByCredentials(DTO credential) {
		User u = lr.findByUsername(credential.username);
		if (u != null) {
			if (u.getPassword().equals(credential.password)) {
				return u;
			}
		}

		return null;
	}

}
