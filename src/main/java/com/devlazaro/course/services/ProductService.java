package com.devlazaro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlazaro.course.entities.Product;
import com.devlazaro.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private  ProductRepository productRepository;
	
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = this.productRepository.findById(id);
		return obj.get();
	}
}
