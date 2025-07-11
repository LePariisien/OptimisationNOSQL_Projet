package com.example.TravelHub.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.redis.core.RedisHash;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "offers")
@Node("Offer")
@RedisHash("Offer")
@Entity
@Table(name = "offers")
public class Offer {

    @Id
    @org.springframework.data.neo4j.core.schema.Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Property("from")
    private String from;

    @Property("to")
    private String to;

    @Property("departDate")
    private LocalDate departDate;

    @Property("returnDate")
    private LocalDate returnDate;

    @Property("provider")
    private String provider;

    @Property("price")
    private BigDecimal price;

    @Property("currency")
    private String currency;

    @Property("legs")
    private List<FlightLeg> legs;

    @Property("hotel")
    private Hotel hotel;

    @Property("activity")
    private Activity activity;

}