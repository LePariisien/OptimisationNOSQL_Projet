package com.example.OptimisationNOSQL.Repositories.MongoDB;

import com.example.OptimisationNOSQL.Entities.Session;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionMongoRepository extends MongoRepository<Session, String> {
    // Ajoute ici des méthodes personnalisées si besoin
}
