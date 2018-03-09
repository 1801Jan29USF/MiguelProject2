package com.revature.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entities.User;
import com.revature.services.LoginService;

@RestController
@RequestMapping("login")
public class LoginController {

	@Autowired
	private LoginService rs;
	
	@PostMapping
	public User loginUser(@RequestBody String username) {
		System.out.println("USER = " + rs.findByUsername(username));
		return null;
	}
}
