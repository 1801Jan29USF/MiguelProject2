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
	public User save(User u) {
		return rr.save(u);
	}
}