package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	//fetching data from database
	@Query("Select u FROM User u Where u.email = ?1")
	User findByEmail(String email);
}