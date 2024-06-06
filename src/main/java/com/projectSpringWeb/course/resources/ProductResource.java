package com.projectSpringWeb.course.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectSpringWeb.course.entities.Product;
import com.projectSpringWeb.course.services.ProdutcService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProdutcService service;

	/* tipo de mapeamento que sera acessado na barra de pesquisa */
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> objOrd = service.findByAll();
		/* Retorna o conteudo da resposta em json */
		return ResponseEntity.ok().body(objOrd);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product byId = service.findById(id);
		return ResponseEntity.ok().body(byId);
	}

}
