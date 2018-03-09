package com.revature.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Event;
import com.revature.repos.EventRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo er;

	@Override
	public Event save(Event e) {
		return er.save(e);
	}

	@Override
	public ArrayList<Event> findAllByType(String type) {
		return er.findAllByType(type);
	}

	@Override
	public ArrayList<Event> findAllByGenre(String genre) {
		return er.findAllByGenre(genre);
	}

	@Override
	public ArrayList<Event> findAllById(int user_id) {
		// TODO Auto-generated method stub
		return er.findAllById(user_id);
	}

}
