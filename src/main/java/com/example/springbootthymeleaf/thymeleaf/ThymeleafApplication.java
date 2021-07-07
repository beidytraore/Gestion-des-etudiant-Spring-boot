package com.example.springbootthymeleaf.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({"com.example.springbootthymeleaf.thymeleaf.service"})
@EntityScan("com.example.springbootthymeleaf.thymeleaf.model")
@EnableJpaRepositories("com.example.springbootthymeleaf.thymeleaf.dao")
@SpringBootApplication
public class ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}

}
