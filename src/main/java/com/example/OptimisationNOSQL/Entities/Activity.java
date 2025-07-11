package com.example.OptimisationNOSQL.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {
    
    private String title;    
    private BigDecimal price;
}
