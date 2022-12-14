package com.educandoWeb.curso.repositories;

import com.educandoWeb.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

