package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
	
}
