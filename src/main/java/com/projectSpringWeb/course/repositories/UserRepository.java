package com.projectSpringWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectSpringWeb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
