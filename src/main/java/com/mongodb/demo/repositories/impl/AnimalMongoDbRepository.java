//package repositories.impl;
//
//import java.util.List;
//import lombok.RequiredArgsConstructor;
//import model.Animal;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Repository;
//import repositories.AnimalRepository;
//
//@Repository
//@Profile("mongodb")
//@RequiredArgsConstructor
//public class AnimalMongoDbRepository implements AnimalRepository {
//
//  @Autowired
//  private final MongoOperations mongoOperations;
//
//  @Override
//  public Animal findOne(Integer id) {
//    Query query = Query.query(Criteria.where("id").is(id));
//    return mongoOperations.findOne(query, Animal.class);
//  }
//
//  @Override
//  public Animal create(Animal animal) {
//    return mongoOperations.save(animal);
//  }
//
//  @Override
//  public List<Animal> findAll() {
//    return mongoOperations.findAll(Animal.class);
//  }
//}
