package com.projectSpringWeb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectSpringWeb.course.entities.Category;
import com.projectSpringWeb.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	/* tipo de mapeamento que sera acessado na barra de pesquisa */
	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> objOrd = service.findByAll();
		/* Retorna o conteudo da resposta em json */
		return ResponseEntity.ok().body(objOrd);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category byId = service.findById(id);
		return ResponseEntity.ok().body(byId);
	}

}
