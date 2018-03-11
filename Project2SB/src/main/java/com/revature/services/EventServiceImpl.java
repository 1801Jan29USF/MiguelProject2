package com.revature.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Event;
import com.revature.repos.EventRepo;
import com.revature.repos.UserRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo er;

	@Autowired
	private UserRepo ur;

	@Override
	public Event save(Event e) {
		return er.save(e);
	}

	@Override
	public ArrayList<Event> findAll() {
		return er.findAll();
	}

	@Override
	public ArrayList<Event> findAllByHostId(String username) {

		return er.findByHostId(ur.findByUsername(username).getId());

	}

}
