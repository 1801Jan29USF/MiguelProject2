package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entities.User;

@Repository
public interface LoginRepo extends JpaRepository<User, String> {

	User findByUsername(String username);

}
