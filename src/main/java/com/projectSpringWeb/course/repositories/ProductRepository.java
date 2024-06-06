package com.projectSpringWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectSpringWeb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
