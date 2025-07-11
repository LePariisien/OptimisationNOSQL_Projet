package com.example.TravelHub.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.redis.core.RedisHash;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "cities")
@Node("City")
@RedisHash("City")
@Entity
@Table(name = "cities")
public class City {

    @Id
    @org.springframework.data.neo4j.core.schema.Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Property("name")
    private String name;

    @Property("country")
    private String country;

}