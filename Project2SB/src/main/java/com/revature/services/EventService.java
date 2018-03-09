package com.revature.services;

import java.util.ArrayList;

import com.revature.entities.Event;

public interface EventService {

	Event save(Event e);

	ArrayList<Event> findAllByType(String type);

	ArrayList<Event> findAllByGenre(String genre);

	ArrayList<Event> findAllById(int user_id);
	

}
