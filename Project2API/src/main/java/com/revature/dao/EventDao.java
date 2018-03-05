package com.revature.dao;

import java.util.ArrayList;

import com.revature.entities.Event;

public interface EventDao {
	// C
	Event save(Event e);

	// R
	Event getById(int id);

	Event loadById(int id);

	// D
	Event merge(Event e);

	ArrayList<Event> findByTypeHQL(int type);

	ArrayList<Event> findByGenreHQL(int genre);

	ArrayList<Event> findByCityHQL(String city);

}
