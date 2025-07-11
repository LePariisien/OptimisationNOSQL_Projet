package com.example.TravelHub.Entities;

import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RelationshipProperties
public class NearRelation {

    @Id
    @GeneratedValue
    private Long id;

    @TargetNode
    private City target;

    private double weight;
}
