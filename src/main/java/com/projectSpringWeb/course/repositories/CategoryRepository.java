package com.projectSpringWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectSpringWeb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
