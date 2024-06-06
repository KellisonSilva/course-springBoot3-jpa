package com.projectSpringWeb.course.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projectSpringWeb.course.entities.Category;
import com.projectSpringWeb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findByAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> objU = repository.findById(id);
		return objU.get();
	}

}
