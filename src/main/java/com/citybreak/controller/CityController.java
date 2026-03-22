package com.citybreak.controller;

import com.citybreak.domain.City;
import com.citybreak.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping("/{id}")
    public City getCity(@PathVariable long id){
        return cityService.getCity(id);
    }

    @GetMapping()
    public List<City> getAllCities(){
        return cityService.getCities();
    }

    @PostMapping()
    public City addCity(@RequestBody City city){
        return cityService.addCity(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable long id, @RequestBody City city){
        return cityService.updateCity(id, city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable long id){
         cityService.deleteCity(id);
    }
}
