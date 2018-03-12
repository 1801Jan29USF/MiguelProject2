package com.revature.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Address;
import com.revature.entities.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

	ArrayList<Event> findAll();

	ArrayList<Event> findByHostId(int id);

	Event findByDateandtime(String getdateandtime);

	ArrayList<Event> findAllByLocation(Address location);

}
