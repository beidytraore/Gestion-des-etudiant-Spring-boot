package com.example.springbootthymeleaf.thymeleaf.dao;

import com.example.springbootthymeleaf.thymeleaf.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Long> {

    Users findByUsername(String username);
    Users findByEmail(String email);
}

