package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.User;

@Repository
public interface RegisterRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);

	User findByEmail(String email);

}
