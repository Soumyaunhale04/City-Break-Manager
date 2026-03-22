package com.citybreak.service;

import com.citybreak.domain.City;
import com.citybreak.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    CityRepository cityRepo;
    @Override
    public City getCity(long Id) {
        City c = cityRepo.findById(Id).orElseThrow();
        return c;
    }

    @Override
    public List<City> getCities() {
        return cityRepo.findAll();
    }

    @Override
    public City addCity(City c) {
        return  cityRepo.save(c);
    }

    @Override
    public City updateCity(long Id, City newCity) {
        City oldCity = getCity(Id);
        oldCity.setName(newCity.getName());
        oldCity.setCountry(newCity.getCountry());
        oldCity.setDescription(newCity.getDescription());
        cityRepo.save(oldCity);
        return oldCity;
    }

    @Override
    public void deleteCity(long Id) {
        cityRepo.deleteById(Id);
    }
}
