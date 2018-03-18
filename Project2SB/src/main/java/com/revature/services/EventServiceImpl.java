package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entities.Event;
import com.revature.entities.Status;
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
	public List<Event> findAll(String username) {
		List<Event> events = new ArrayList<Event>();
		Event temp = new Event();
		User hosttemp = ur.findByUsername(username);
		temp.setLocation(hosttemp.getAddress());
		temp.setHost(hosttemp);
		events = er.findAll();
		events.add(temp);
		return events;
	}

	@Override
	public ArrayList<Event> findAllByHostId(String username) {
		return er.findByHostId(ur.findByUsername(username).getId());

	}

	@Override
	public Event createEvent(Event e) {
		System.out.println("MY EVENT: " + e);
		List<Event> events = er.findAllByLocation(e.getLocation());
		for (Event event : events) {
			if (event.getDateandtime().equals(e.getDateandtime())
					&& event.getLocation().getId() == e.getLocation().getId()) {
				return null;
			}
		}
		er.save(e);
		return e;
	}

	// attending
	@Override
	public Event attendEvent(String username, int eventid, int attending) {
		User user = ur.findByUsername(username);
		int id = user.getId();
		UsersEvents ue = new UsersEvents(id, eventid);
		uer.save(ue);
		Event event = er.findById(eventid);
		event.setAttending(event.getAttending() + attending);
		return er.save(event);

	}

	@Override
	public void approveEvent(int eventid, int status) {
		Event e = er.findById(eventid);
		Status s = new Status();
		s.setId(status);
		e.setStatus(s);
		er.save(e);

	}
}
