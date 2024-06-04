package com.projectSpringWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectSpringWeb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
