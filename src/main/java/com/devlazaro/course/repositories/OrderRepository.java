package com.devlazaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlazaro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
