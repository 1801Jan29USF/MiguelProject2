package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.DTO;
import com.revature.entities.User;
import com.revature.services.LoginService;

@RestController
@RequestMapping("Login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService ls;

	@PostMapping
	public User loginUser(@RequestBody DTO credential) {
		return ls.findByCredentials(credential);
	}
}
