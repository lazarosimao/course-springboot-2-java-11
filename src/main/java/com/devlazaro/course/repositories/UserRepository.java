package com.devlazaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlazaro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
