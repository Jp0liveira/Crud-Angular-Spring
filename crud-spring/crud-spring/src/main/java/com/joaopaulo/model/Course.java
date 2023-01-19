package com.joaopaulo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data // gera os gets, set, equals..etc
@Entity
// @Table( name = "cursos")
public class Course {

  @Id // chave primaria
  @GeneratedValue( strategy = GenerationType.AUTO )
  private Long id;

  @Column( length = 200, nullable = false )
  private String name;

  @Column( length = 10, nullable = false )
  private String category;

}
