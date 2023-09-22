package com.mongodb.demo.services.impl;

import com.mongodb.demo.model.Animal;
import com.mongodb.demo.repositories.AnimalRepository;
import com.mongodb.demo.services.CreateAnimal;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateAnimalImpl implements CreateAnimal {

  @Autowired
  private AnimalRepository animalRepository;

  @Override
  public Animal createAnimal(Animal animal) {
    return animalRepository.save(animal);
  }
}
