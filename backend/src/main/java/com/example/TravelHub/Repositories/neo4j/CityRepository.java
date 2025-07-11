package com.example.TravelHub.Repositories.neo4j;

import com.example.TravelHub.Entities.City;

import java.util.List;

import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends Neo4jRepository<City, String> {

    @Query("""
                MATCH (c:City {code: $city})-[r:NEAR]->(n:City)
                RETURN n ORDER BY r.weight DESC LIMIT $k
            """)
    List<City> findRecommendedCities(@Param("city") String city, @Param("k") int k);
}
