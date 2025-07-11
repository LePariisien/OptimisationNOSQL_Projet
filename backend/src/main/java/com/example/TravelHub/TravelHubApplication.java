package com.example.TravelHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.TravelHub.Repositories.mongo")
@EnableNeo4jRepositories(basePackages = "com.example.TravelHub.Repositories.neo4j")
public class TravelHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelHubApplication.class, args);
	}

}
