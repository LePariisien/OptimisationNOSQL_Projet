package com.example.TravelHub.Repositories;

import com.example.TravelHub.Entities.Session;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionMongoRepository extends MongoRepository<Session, String> {

}
