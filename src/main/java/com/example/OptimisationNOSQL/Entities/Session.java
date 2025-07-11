package com.example.OptimisationNOSQL.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.redis.core.RedisHash;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "sessions")
@Node("Session")
@RedisHash("Session")
@Entity
@Table(name = "sessions")
public class Session {
    
    @Id
    @org.springframework.data.neo4j.core.schema.Id
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Property("sessionToken")
    private String sessionToken;
    
    @Property("userId")
    private String userId;
    
    @Property("userEmail")
    private String userEmail;
    
    @Property("userName")
    private String userName;
    
    @Property("sessionStart")
    private LocalDateTime sessionStart;
    
    @Property("sessionEnd")
    private LocalDateTime sessionEnd;

}