package com.projectSpringWeb.course.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectSpringWeb.course.entities.Order;
import com.projectSpringWeb.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService service;

	/* tipo de mapeamento que sera acessado na barra de pesquisa */
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> objOrd = service.findByAll();
		/* Retorna o conteudo da resposta em json */
		return ResponseEntity.ok().body(objOrd);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order byId = service.findById(id);
		return ResponseEntity.ok().body(byId);
	}

}
