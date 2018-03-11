package com.revature.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entities.Address;
import com.revature.entities.Event;
import com.revature.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);

	ArrayList<Event> findAllByAddress(Address loc);

}
