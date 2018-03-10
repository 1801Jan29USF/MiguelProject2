package com.revature.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.Event;
import com.revature.entities.Genre;
import com.revature.entities.Type;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer> {

	ArrayList<Event> findAllByType(Type type);

	ArrayList<Event> findAllByGenre(Genre genre);

	ArrayList<Event> findAllByCity(String city);

}
