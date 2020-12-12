package com.devlazaro.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devlazaro.course.entities.User;
import com.devlazaro.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository userRepository;
	
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = this.userRepository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return this.userRepository.save(obj);
	}
}
