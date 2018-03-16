package com.revature.services;

import java.util.ArrayList;

import com.revature.entities.Event;

public interface EventService {

	Event save(Event e);

	ArrayList<Event> findAll();

	ArrayList<Event> findAllByHostId(String username);

	Event createEvent(Event e);

	void updateEvent(String username, int eventid, int attending);



	

}
