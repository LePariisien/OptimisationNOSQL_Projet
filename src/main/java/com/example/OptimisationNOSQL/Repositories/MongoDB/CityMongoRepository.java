package com.example.OptimisationNOSQL.Repositories.MongoDB;

import com.example.OptimisationNOSQL.Entities.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMongoRepository extends MongoRepository<City, String> {
    // Ajoute ici des méthodes personnalisées si besoin
}
