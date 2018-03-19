package com.revature.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

	@Override
	public User findByUsername(String username) {
		return ur.findByUsername(username);
	}

//	@Override
//	public Set<Event> findAll(String username) {
//		return ur.findByUsername(username).getUserevents();
//	}

	@Override
	public List<User> findAll() {
		return ur.findAll();
	}

}
