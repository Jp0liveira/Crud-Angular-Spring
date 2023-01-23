package com.joaopaulo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

  @PostMapping
  @ResponseStatus( code = HttpStatus.CREATED )
  public  Course create( @RequestBody Course course ){
    return courseRepository.save(course);

    // return ResponseEntity.status( HttpStatus.CREATED )
    //       .body(courseRepository.save(course));

  }

}
