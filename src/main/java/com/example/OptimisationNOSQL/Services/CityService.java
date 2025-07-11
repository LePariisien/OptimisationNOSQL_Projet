
package com.example.OptimisationNOSQL.Services;

import com.example.OptimisationNOSQL.Entities.City;
import com.example.OptimisationNOSQL.Repositories.MongoDB.CityMongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private final CityMongoRepository cityRepository;

    public CityService(CityMongoRepository cityRepository) {
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
