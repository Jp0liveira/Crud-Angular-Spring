package com.joaopaulo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaopaulo.model.Course;
import com.joaopaulo.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController // diz que a classe vai ser uma javaServelet ( metodos: Post, Get etc..)
@RequestMapping("/api/courses")
@AllArgsConstructor // gera os construtores
public class CoursesController {

  private CourseRepository courseRepository;

  //@RequestMapping( method = RequestMethod.GET );
  @GetMapping
  public List<Course>  list() {
    return courseRepository.findAll( );

  }

}
