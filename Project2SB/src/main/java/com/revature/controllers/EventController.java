package com.revature.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Event;
import com.revature.services.EventService;

@RestController
@RequestMapping("events")
public class EventController {

	@Autowired
	private EventService es;

	@GetMapping("searchEvents")
	public ArrayList<Event> findAll() {
		return es.findAll();
	}

}
