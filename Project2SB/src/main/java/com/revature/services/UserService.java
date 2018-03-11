package com.revature.services;

import java.util.ArrayList;

import com.revature.entities.Address;
import com.revature.entities.Event;
import com.revature.entities.User;

public interface UserService {

	User save(User u);

	int updateProfile(String username);

	ArrayList<Event> findAllByAddress(Address loc);

}
