package com.example.TravelHub.Repositories.mongo;

import com.example.TravelHub.Entities.Offer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends MongoRepository<Offer, String> {
    List<Offer> findByFromAndToOrderByPriceAsc(String from, String to);
}
