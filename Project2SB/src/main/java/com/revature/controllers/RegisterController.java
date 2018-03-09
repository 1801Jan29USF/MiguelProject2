package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.User;
import com.revature.services.RegisterService;

@RestController
@RequestMapping("register")
public class RegisterController {

	@Autowired
	private RegisterService rs;

	@PostMapping
	public User createUser(@Valid @RequestBody User u) {

		return rs.findByUsername(u);
	}
}
