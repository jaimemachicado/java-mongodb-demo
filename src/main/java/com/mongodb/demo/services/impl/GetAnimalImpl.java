package com.mongodb.demo.services.impl;

import com.mongodb.demo.model.Animal;
import com.mongodb.demo.repositories.AnimalRepository;
import com.mongodb.demo.services.GetAnimal;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetAnimalImpl implements GetAnimal {

  @Autowired
  private AnimalRepository animalRepository;

  @Override
  public Animal getAnimal(String id) {
    Optional<Animal> optional = animalRepository.findById(id);
    return optional.orElse(null);
  }
}
