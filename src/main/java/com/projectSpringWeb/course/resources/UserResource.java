package com.projectSpringWeb.course.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectSpringWeb.course.entities.User;
import com.projectSpringWeb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	/* tipo de mapeamento que sera acessado na barra de pesquisa */
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> objUsers = service.findByAll();
		/* Retorna o conteudo da resposta em json */
		return ResponseEntity.ok().body(objUsers);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User byId = service.findById(id);
		return ResponseEntity.ok().body(byId);
	}

}
