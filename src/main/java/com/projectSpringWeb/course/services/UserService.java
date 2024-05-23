package com.projectSpringWeb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectSpringWeb.course.entities.User;
import com.projectSpringWeb.course.repositories.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repository;
	
	
	public List<User> findByAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> objU = repository.findById(id);
		return objU.get();
	}
	
	
	
	
	
}
