package com.projectSpringWeb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectSpringWeb.course.entities.Product;
import com.projectSpringWeb.course.repositories.ProductRepository;

@Service
public class ProdutcService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findByAll() {
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> objU = repository.findById(id);
		return objU.get();
	}

}
