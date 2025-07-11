
package com.example.OptimisationNOSQL.Services;

import com.example.OptimisationNOSQL.Entities.Offer;
import com.example.OptimisationNOSQL.Repositories.MongoDB.OfferMongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {
    private final OfferMongoRepository offerRepository;

    public OfferService(OfferMongoRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    public List<Offer> getAllOffers() {
        return offerRepository.findAll();
    }

    public Optional<Offer> getOfferById(String id) {
        return offerRepository.findById(id);
    }

    public List<Offer> getOffersByFrom(String from) {
        return offerRepository.findByFrom(from);
    }

    public List<Offer> getOffersByTo(String to) {
        return offerRepository.findByTo(to);
    }

    public List<Offer> getOffersByProvider(String provider) {
        return offerRepository.findByProvider(provider);
    }

    public Offer saveOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public void deleteOffer(String id) {
        offerRepository.deleteById(id);
    }
}
