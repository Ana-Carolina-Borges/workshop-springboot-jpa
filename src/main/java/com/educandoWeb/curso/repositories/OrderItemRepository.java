package com.educandoWeb.curso.repositories;

import com.educandoWeb.curso.entities.Order;
import com.educandoWeb.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
