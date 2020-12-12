package com.devlazaro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlazaro.course.entities.Order;
import com.devlazaro.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private  OrderRepository OrderRepository;
	
	public List<Order> findAll() {
		return this.OrderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = this.OrderRepository.findById(id);
		return obj.get();
	}
}
