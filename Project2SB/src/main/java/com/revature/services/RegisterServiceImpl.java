package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.User;
import com.revature.repos.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepo rr;

	@Override
	public User register(User u) {
		if (rr.findByEmail(u.getEmail()) != null) {
			return null;
		}
		if (rr.findByUsername(u.getUsername()) != null) {
			return null;
		}
		rr.save(u);
		return u;
	}

}
