package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.ApproveDTO;
import com.revature.dto.AttendingDTO;
import com.revature.entities.Event;
import com.revature.services.EventService;

@RestController
@RequestMapping("events")
@CrossOrigin(origins = "http://localhost:4200")
public class EventController {

	@Autowired
	private EventService es;

	// approve/deny
	@GetMapping(value = { "pastEvents/{username}", "searchEvents/{username}" })
	public List<Event> findAllSearch(@PathVariable String username) {
		return es.findAll(username);
	}

	// approve/deny
	@PostMapping("pastEvents")
	public void approveEvent(@RequestBody ApproveDTO a) {
		es.approveEvent(a.eventid, a.status);
	}

	// attending/notattending
	@PostMapping("searchEvents")
	public void attendEventPast(@RequestBody AttendingDTO a) {
		System.out.println("CREDENT::   + " + a.eventid + " " + a.username + " " + a.attending);
		es.attendEvent(a.username, a.eventid, a.attending);
	}

}
