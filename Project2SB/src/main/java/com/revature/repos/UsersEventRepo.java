package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.UsersEvent;

@Repository
public interface UsersEventRepo extends JpaRepository<UsersEvent, Integer> {

	List<UsersEvent> findAllById(int id);

}
