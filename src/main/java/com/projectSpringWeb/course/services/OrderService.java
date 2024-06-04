package com.projectSpringWeb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectSpringWeb.course.entities.Order;
import com.projectSpringWeb.course.repositories.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findByAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> objU = repository.findById(id);
		return objU.get();
	}
	
	
	
	
	
}
