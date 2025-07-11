
package com.example.TravelHub.Services;

import com.example.TravelHub.Entities.City;
import com.example.TravelHub.Repositories.neo4j.CityRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public Optional<City> getCityById(String id) {
        return cityRepository.findById(id);
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public void deleteCity(String id) {
        cityRepository.deleteById(id);
    }
}
