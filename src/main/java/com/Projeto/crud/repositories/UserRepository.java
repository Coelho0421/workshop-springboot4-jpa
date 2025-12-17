package com.Projeto.crud.repositories;

import com.Projeto.crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
