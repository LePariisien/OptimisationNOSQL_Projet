package com.example.OptimisationNOSQL.Controllers;

import com.example.OptimisationNOSQL.Entities.Offer;
import com.example.OptimisationNOSQL.Services.OfferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offers")
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping
    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Offer> getOfferById(@PathVariable String id) {
        return offerService.getOfferById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/from/{from}")
    public List<Offer> getOffersByFrom(@PathVariable String from) {
        return offerService.getOffersByFrom(from);
    }

    @GetMapping("/to/{to}")
    public List<Offer> getOffersByTo(@PathVariable String to) {
        return offerService.getOffersByTo(to);
    }

    @GetMapping("/provider/{provider}")
    public List<Offer> getOffersByProvider(@PathVariable String provider) {
        return offerService.getOffersByProvider(provider);
    }

    @PostMapping
    public Offer createOffer(@RequestBody Offer offer) {
        return offerService.saveOffer(offer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOffer(@PathVariable String id) {
        offerService.deleteOffer(id);
        return ResponseEntity.noContent().build();
    }
}
