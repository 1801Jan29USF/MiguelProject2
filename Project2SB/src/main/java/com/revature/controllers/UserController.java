package com.revature.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Event;
import com.revature.entities.User;
import com.revature.services.EventService;
import com.revature.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private EventService es;

	@Autowired
	private UserService us;

	@PostMapping("/createEvent")
	public void createEvent(@RequestBody Event e) {
		es.save(e);
		return;
	}

	@PostMapping("/pastevents")
	public ArrayList<Event> findAll(@RequestBody User u) {
		return es.findAllByHostId(u.getId());
	}

	@PostMapping("/updateprofile")
	public User save(@RequestBody User u) {
		return us.save(u);
	}

}