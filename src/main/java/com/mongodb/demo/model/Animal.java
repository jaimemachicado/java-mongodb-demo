package com.mongodb.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Animal")
@Data
public class Animal {

  @Id
  @JsonAlias(value = "id")
  private String id;
  @JsonAlias(value = "name")
  private String name;
  @JsonAlias(value = "color")
  private String color;
}
