package com.joaopaulo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.joaopaulo.model.Course;
import com.joaopaulo.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase( CourseRepository courseRepository ){
		return args -> {
			Course curso = new Course( );
			curso.setName("Angular-Spring");
			curso.setCategory("Full-Stack");
			courseRepository.save( curso );
		};

	}
}
