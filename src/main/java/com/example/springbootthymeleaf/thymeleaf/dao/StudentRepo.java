package com.example.springbootthymeleaf.thymeleaf.dao;

import com.example.springbootthymeleaf.thymeleaf.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    Page<Student> findByNameContains(String keyWord, PageRequest of);
}
