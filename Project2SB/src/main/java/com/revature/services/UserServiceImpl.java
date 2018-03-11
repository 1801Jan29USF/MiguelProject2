package com.revature.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Address;
import com.revature.entities.Event;
import com.revature.entities.User;
import com.revature.repos.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo ur;

	@Override
	public User save(User u) {
		return ur.save(u);
	}

	@Override
	public int updateProfile(String username) {
		return ur.findByUsername(username).getId();

	}

	@Override
	public ArrayList<Event> findAllByAddress(Address loc) {
		return findAllByAddress(loc);
	}

}
