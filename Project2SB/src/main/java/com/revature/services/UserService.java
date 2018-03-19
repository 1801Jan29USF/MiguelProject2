package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.entities.Address;
import com.revature.entities.Event;
import com.revature.entities.User;

public interface UserService {

	User save(User u);

	int updateProfile(String username);

	ArrayList<Event> findAllByAddress(Address loc);

	User findByUsername(String username);

	// Set<Event> findAll(String username);

	List<User> findAll();
}
