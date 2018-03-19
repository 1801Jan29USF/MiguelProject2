package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entities.UsersEvents;

public interface UsersEventsRepo extends JpaRepository<UsersEvents, Integer> {

}
