package com.example.springbootthymeleaf.thymeleaf.service;

import com.example.springbootthymeleaf.thymeleaf.dao.StudentRepo;
import com.example.springbootthymeleaf.thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
   @Bean
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public void save(Student student) {
        studentRepo.save(student);
    }

    public Student get(long id) {
        return studentRepo.findById(id).get();
    }

    public void delete(long id) {
        studentRepo.deleteById(id);
    }
}
