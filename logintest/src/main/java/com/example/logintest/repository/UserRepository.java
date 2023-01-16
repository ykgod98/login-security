package com.example.logintest.repository;

import com.example.logintest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findOneById(String id);
}