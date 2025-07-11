package com.example.OptimisationNOSQL.Repositories.MongoDB;

import com.example.OptimisationNOSQL.Entities.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferMongoRepository extends MongoRepository<Offer, String> {
    List<Offer> findByFrom(String from);
    List<Offer> findByTo(String to);
    List<Offer> findByProvider(String provider);
}
