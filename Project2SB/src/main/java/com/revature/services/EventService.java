package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.entities.Event;

public interface EventService {

	Event save(Event e);

	List<Event> findAll(String username);

	ArrayList<Event> findAllByHostId(String username);

	Event createEvent(Event e);

	Event attendEvent(String username, int eventid, int attending);

	void approveEvent(int eventid, int attending);

}
