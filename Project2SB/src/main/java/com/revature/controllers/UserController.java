package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.Address;
import com.revature.entities.Event;
import com.revature.entities.User;
import com.revature.entities.UsersEvents;
import com.revature.services.EventService;
import com.revature.services.UserService;

@RestController
@RequestMapping("User")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private EventService es;

	@Autowired
	private UserService us;

	@PostMapping("/CreateEvent")
	public Event createEvent(@RequestBody Event e) {
		return es.createEvent(e);
	}

	// only events that a user has hosted
	@GetMapping("/HostedEvents/{username}")
	public ArrayList<Event> findAll(@PathVariable String username) {
		return es.findAllByHostId(username);
	}

	// events that a user has hosted at his/her house
	// and events that other's have hosted at user's house
	@GetMapping("/MyHouse")
	public ArrayList<Event> pendingEvents(@RequestBody Address loc) {
		return us.findAllByAddress(loc);
	}

	// all events that a user has attended
	@GetMapping("/AttendedEvents/{username}")
	public Set<Event> attendedEvents(@PathVariable String username) {
		return us.findAll(username);
	}

	@PostMapping("/UpdateProfile/{username}")
	public User updateProfile(@RequestBody User u, @PathVariable String username) {

		u.setId(us.updateProfile(username));
		return us.save(u);
	}

	@GetMapping(value = "/Profile/{username}")
	public User getProfileInfo(@PathVariable String username) {
		return us.findByUsername(username);
	}

	@GetMapping(value = "/CreateEvent")
	public List<User> getAllUsers() {
		return us.findAll();
	}

}