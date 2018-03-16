package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Event;
import com.revature.entities.User;
import com.revature.entities.UsersEvents;
import com.revature.repos.EventRepo;
import com.revature.repos.UserRepo;
import com.revature.repos.UsersEventsRepo;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	private EventRepo er;

	@Autowired
	private UserRepo ur;

	@Autowired
	private UsersEventsRepo uer;

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

	@Override
	public Event createEvent(Event e) {

		List<Event> events = er.findAllByLocation(e.getLocation());
		System.out.println("ALL EVENTS" + events);
		for (Event event : events) {
			System.out.println("hnohere");
			if (event.getDateandtime().equals(e.getDateandtime())
					&& event.getLocation().getId() == e.getLocation().getId()) {
				return null;
			}
		}
		System.out.println("Made it here " + e);
		er.save(e);
		System.out.println("ALSO here" + e);
		return e;
	}

	@Override
	public void updateEvent(String username, int eventid, int attending) {
		User user = ur.findByUsername(username);
		int id = user.getId();
		UsersEvents ue = new UsersEvents(id, eventid);
		uer.save(ue);

		Event event = er.findById(eventid);
		event.setAttending(event.getAttending() + attending);
		er.save(event);

	}
}
