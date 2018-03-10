package com.revature.services;

import java.util.ArrayList;

import com.revature.entities.Event;
import com.revature.entities.Genre;
import com.revature.entities.Type;

public interface EventService {

	Event save(Event e);

	ArrayList<Event> findAllByType(Type type);

	ArrayList<Event> findAllByGenre(Genre genre);

	ArrayList<Event> findAllByCity(String city);

	ArrayList<Event> findAllByHostId(int id);

}
