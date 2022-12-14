package com.educandoWeb.curso.repositories;

import com.educandoWeb.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
