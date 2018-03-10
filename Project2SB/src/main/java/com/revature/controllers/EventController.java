package com.revature.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Event;
import com.revature.entities.Genre;
import com.revature.entities.Type;
import com.revature.services.EventService;

@RestController
@RequestMapping("events")
public class EventController {

	@Autowired
	private EventService es;

	@PostMapping("searchByType")
	public ArrayList<Event> findAllByType(@RequestBody Type type) {
		System.out.println(type);
		System.out.println("EVENTS: " + es.findAllByType(type));
		return es.findAllByType(type);
	}

	@PostMapping("searchByGenre")
	public ArrayList<Event> findAllByGenre(@RequestBody Genre genre) {
		return es.findAllByGenre(genre);
	}

	@PostMapping("searchByCity")
	public ArrayList<Event> findAllByCity(@RequestBody String city) {
		return es.findAllByCity(city);
	}

}
