package com.citybreak.service;

import com.citybreak.domain.City;

import java.util.List;

public interface CityService {
    City getCity(long Id);
    List<City> getCities();
    City addCity(City c);
    City updateCity(long Id, City c);
    void deleteCity(long Id);
}
