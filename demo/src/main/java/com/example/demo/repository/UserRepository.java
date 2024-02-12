package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name); // Método para encontrar usuários por nome

    List<User> findByEmail(String email); // Método para encontrar usuários por email
}
