
package com.example.OptimisationNOSQL.Services;

import com.example.OptimisationNOSQL.Entities.City;
import com.example.OptimisationNOSQL.Entities.Offer;
import com.example.OptimisationNOSQL.Entities.Session;
import com.example.OptimisationNOSQL.Entities.FlightLeg;
import com.example.OptimisationNOSQL.Entities.Hotel;
import com.example.OptimisationNOSQL.Entities.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CityService cityService;
    @Autowired
    private OfferService offerService;
    @Autowired
    private SessionService sessionService;

    @Override
    public void run(String... args) throws Exception {
        if (cityService.getAllCities().isEmpty()) {
            initializeData();
        }
    }

    private void initializeData() {
        City paris = new City(null, "Paris", "France");
        City london = new City(null, "London", "United Kingdom");
        City tokyo = new City(null, "Tokyo", "Japan");
        City newYork = new City(null, "New York", "United States");
        paris = cityService.saveCity(paris);
        london = cityService.saveCity(london);
        tokyo = cityService.saveCity(tokyo);
        newYork = cityService.saveCity(newYork);

        FlightLeg leg1 = new FlightLeg("BA205", "CDG", "LHR", 75);
        Offer offer1 = new Offer(null, "Paris", "London", LocalDate.now().plusDays(2), null, "British Airways", new BigDecimal("120.00"), "EUR", Arrays.asList(leg1), null, null);
        offerService.saveOffer(offer1);

        FlightLeg leg2 = new FlightLeg("AZ101", "CDG", "NRT", 255);
        Hotel hotelTokyo = new Hotel("Tokyo Grand Hotel", 6, new BigDecimal("180.00"));
        Offer offer2 = new Offer(null, "Paris", "Tokyo", LocalDate.now().plusDays(5), LocalDate.now().plusDays(12), "AirZen", new BigDecimal("1250.00"), "EUR", Arrays.asList(leg2), hotelTokyo, null);
        offerService.saveOffer(offer2);

        FlightLeg leg3 = new FlightLeg("AF100", "JFK", "CDG", 420);
        Activity activityParis = new Activity("Tour Eiffel visit", new BigDecimal("30.00"));
        Offer offer3 = new Offer(null, "New York", "Paris", LocalDate.now().plusDays(10), LocalDate.now().plusDays(15), "Air France", new BigDecimal("900.00"), "USD", Arrays.asList(leg3), null, activityParis);
        offerService.saveOffer(offer3);

        Session session1 = new Session(
            null, 
            "token1", 
            "user1", 
            "user1@example.com", 
            "User One", 
            LocalDate.now().atStartOfDay(), 
            LocalDate.now().atTime(12,0) 
        );
        Session session2 = new Session(
            null,
            "token2",
            "user2",
            "user2@example.com",
            "User Two",
            LocalDate.now().atStartOfDay(),
            LocalDate.now().atTime(13,0)
        );
        sessionService.saveSession(session1);
        sessionService.saveSession(session2);

        System.out.println("Sample data initialized successfully!");
        System.out.println("Cities: " + cityService.getAllCities().size());
        System.out.println("Offers: " + offerService.getAllOffers().size());
        System.out.println("Sessions: " + sessionService.getAllSessions().size());
    }
}
