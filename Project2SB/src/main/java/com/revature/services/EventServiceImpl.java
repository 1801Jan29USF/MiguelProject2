package com.revature.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Event;
import com.revature.entities.Genre;
import com.revature.entities.Type;
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
	public ArrayList<Event> findAllByType(Type type) {
		return er.findAllByType(type);
	}

	@Override
	public ArrayList<Event> findAllByGenre(Genre genre) {
		return er.findAllByGenre(genre);
	}

	@Override
	public ArrayList<Event> findAllByCity(String city) {

		return er.findAllByCity(city);
	}

	@Override
	public ArrayList<Event> findAllByHostId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
