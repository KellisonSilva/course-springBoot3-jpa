package com.projectSpringWeb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectSpringWeb.course.entities.OrderItem;
import com.projectSpringWeb.course.entities.Pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
