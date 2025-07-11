package com.example.OptimisationNOSQL.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightLeg {
    
    private String flightNum;
    private String dep;      
    private String arr;      
    private Integer duration;
}
