package com.revature.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.dto.DTO;
import com.revature.entities.User;
import com.revature.repos.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepo lr;

	@Override
	public User findByUsername(String credential) {

		ObjectMapper mapper = new ObjectMapper();

		DTO cred = new DTO();

		try {
			cred = mapper.readValue(credential, DTO.class);
		} catch (JsonParseException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return lr.findByUsername(cred.username);
	}

}
