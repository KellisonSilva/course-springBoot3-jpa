package com.projectSpringWeb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projectSpringWeb.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	/*tipo de mapeamento que sera acessado na barra de pesquisa*/
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Maria", "maria@gmail.com", "2222-2222", "123456");
		
		/*Retorna o conteudo da resposta em json*/
		return ResponseEntity.ok().body(u);
	}

}
