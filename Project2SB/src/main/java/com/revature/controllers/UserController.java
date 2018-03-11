package com.revature.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Address;
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

	// only events that a user has hosted
	@PostMapping("/myevents/{username}")
	public ArrayList<Event> findAll(@PathVariable String username) {
		return es.findAllByHostId(username);
	}

	@PostMapping("/updateprofile/{username}")
	public User updateProfile(@RequestBody User u, @PathVariable String username) {

		u.setId(us.updateProfile(username));
		return us.save(u);
	}

	// events that a user has hosted at his/her house
	// and events that other's have hosted at user's house
	@PostMapping("/pendingevents")
	public ArrayList<Event> pendingEvents(@RequestBody Address loc) {
		return us.findAllByAddress(loc);
	}

}