package com.revature.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

	ArrayList<Event> findAllByType(String type);

	ArrayList<Event> findAllByGenre(String genre);

	ArrayList<Event> findAllByHostId(int id);

}
