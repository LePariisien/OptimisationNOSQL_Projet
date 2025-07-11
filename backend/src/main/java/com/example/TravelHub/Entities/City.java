package com.example.TravelHub.Entities;

import lombok.*;

import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Node
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    private String code;
    private String name;
    private String country;

    @Relationship(type = "NEAR", direction = Relationship.Direction.OUTGOING)
    private List<NearRelation> nearCities;
}