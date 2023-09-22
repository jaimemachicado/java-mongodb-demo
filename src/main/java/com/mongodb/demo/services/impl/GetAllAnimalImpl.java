package com.mongodb.demo.services.impl;

import com.mongodb.demo.model.Animal;
import com.mongodb.demo.repositories.AnimalRepository;
import com.mongodb.demo.services.GetAllAnimal;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetAllAnimalImpl implements GetAllAnimal {

  @Autowired
  private AnimalRepository animalRepository;

  @Override
  public List<Animal> getAllAnimal() {
    return animalRepository.findAll();
  }
}
