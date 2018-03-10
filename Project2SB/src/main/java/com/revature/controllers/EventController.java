package com.revature.controllers;

import java.util.ArrayList;

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


	@PostMapping("events/q={type}")
	public ArrayList<Event> findAllByType(@RequestBody String type) {
		return es.findAllByType(type);
	}

	@PostMapping("events/q={genre}")
	public ArrayList<Event> findAllByGenre(@RequestBody String genre) {
		return es.findAllByGenre(genre);
	}

	@PostMapping("events/q={id}")
	public ArrayList<Event> findAllByUserId(@RequestBody int id) {
		return es.findAllByHostId(id);
	}

}
