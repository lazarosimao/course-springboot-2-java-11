package com.devlazaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlazaro.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
