package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.User;
import com.revature.repos.LoginRepo;


@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo lr;

	

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return lr.findByUsername(username);
	}

}
