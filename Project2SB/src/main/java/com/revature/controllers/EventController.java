package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Event;
import com.revature.services.EventService;

@RestController
@RequestMapping("events")
public class EventController {
	
	@Autowired
	private EventService es;
	
	@PostMapping
	public Event createEvent(@Valid @RequestBody Event e) {
		return es.save(e);
	}
}
