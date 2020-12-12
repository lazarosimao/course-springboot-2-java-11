package com.devlazaro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlazaro.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
