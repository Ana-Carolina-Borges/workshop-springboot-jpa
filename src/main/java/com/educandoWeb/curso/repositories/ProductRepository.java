package com.educandoWeb.curso.repositories;

import com.educandoWeb.curso.entities.Category;
import com.educandoWeb.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
