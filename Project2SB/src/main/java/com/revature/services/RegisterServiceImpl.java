package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.User;
import com.revature.repos.RegisterRepo;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepo rr;

	@Override
	public User save(User u) {
		return rr.save(u);

	}

	@Override
	public String register(User u) {

		if (rr.findByEmail(u.getEmail()) != null && rr.findByUsername(u.getUsername()) != null) {
			return "Email and Username already exist";
		}
		if (rr.findByEmail(u.getEmail()) != null) {
			return "Email already exists";
		}
		if (rr.findByUsername(u.getUsername()) != null) {
			return "Username already exists";
		}
		
		rr.save(u);
		return "Success";
	}

}
