package com.example.OptimisationNOSQL.Controllers;

import com.example.OptimisationNOSQL.Entities.City;
import com.example.OptimisationNOSQL.Services.CityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable String id) {
        return cityService.getCityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable String id) {
        cityService.deleteCity(id);
        return ResponseEntity.noContent().build();
    }
}
