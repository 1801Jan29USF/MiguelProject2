package com.revature.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.AttendingDTO;
import com.revature.entities.Event;
import com.revature.services.EventService;

@RestController
@RequestMapping("events")
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {

	@Autowired
	private EventService es;

	@GetMapping("searchEvents")
	public ArrayList<Event> findAll() {
		return es.findAll();
	}

	@PostMapping("searchEvents")
	public void updateEvent(@RequestBody AttendingDTO a) {
		es.updateEvent(a.username, a.eventid, a.attending);
	}

}
