package com.mongodb.demo.controllers;

import com.mongodb.demo.model.Animal;
import com.mongodb.demo.services.CreateAnimal;
import com.mongodb.demo.services.GetAllAnimal;
import com.mongodb.demo.services.GetAnimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
@RequiredArgsConstructor
public class AnimalController {

  @Autowired
  private CreateAnimal createAnimal;

  @Autowired
  private GetAnimal getAnimal;

  @Autowired
  private GetAllAnimal getAllAnimal;

  @PostMapping
  public ResponseEntity<Animal> createAnimal(Animal animal) {
    return ResponseEntity.ok(createAnimal.createAnimal(animal));
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Animal> getAnimal(@PathVariable String id) {
    return ResponseEntity.ok(getAnimal.getAnimal(id));
  }

  @GetMapping(value = "/all")
  public ResponseEntity<List<Animal>> getAll() {
    return ResponseEntity.ok(getAllAnimal.getAllAnimal());
  }
}
