package com.citybreak.controller;

import com.citybreak.domain.Trip;
import com.citybreak.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
public class TripController {
    @Autowired
    TripService tripService;

    @GetMapping("/{id}")
    public Trip getTrip(@PathVariable long id){
        return tripService.getTrip(id);
    }

    @GetMapping()
    public List<Trip> getAllTrips(){
        return tripService.getAllTrips();
    }

    @PostMapping()
    public Trip addTrip(@RequestBody Trip trip){
        return tripService.addTrip(trip);
    }
    @PutMapping("/{id}")
    public Trip updateTrip(@PathVariable long id, @RequestBody Trip trip){
        return tripService.updateTrip(id,trip);
    }

    @DeleteMapping("/{id}")
    public void deleteTrip(@PathVariable long id){
        tripService.deleteTrip(id);
    }
}
