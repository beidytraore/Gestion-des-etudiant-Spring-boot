package com.example.springbootthymeleaf.thymeleaf.dao;


import com.example.springbootthymeleaf.thymeleaf.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Roles, Long> {

    Roles findByRoleName(String RoleName);
}
