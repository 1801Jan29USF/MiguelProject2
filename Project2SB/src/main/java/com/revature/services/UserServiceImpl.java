package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Address;
import com.revature.entities.Event;
import com.revature.entities.User;
import com.revature.entities.UsersEvent;
import com.revature.repos.EventRepo;
import com.revature.repos.UserRepo;
import com.revature.repos.UsersEventRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo ur;

	@Autowired
	private UsersEventRepo uer;

	@Autowired
	private EventRepo er;

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

	@Override
	public List<Event> findAll(String username) {
		int id = ur.findByUsername(username).getId();
		List<UsersEvent> usersEvents = uer.findAllById(id);
		List<Event> attendedEvents = new ArrayList<Event>();
		for (UsersEvent userEvent : usersEvents) {
			attendedEvents.add(er.findById(userEvent.getEventid()));
		}

		return attendedEvents;
	}

}
