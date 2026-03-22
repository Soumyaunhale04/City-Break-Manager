package com.citybreak.service;

import com.citybreak.domain.Trip;
import com.citybreak.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService{
    @Autowired
    TripRepository tripRepo;


    @Override
    public Trip getTrip(long Id) {
        return tripRepo.findById(Id).orElseThrow();
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepo.findAll();
    }

    @Override
    public Trip addTrip(Trip trip) {
        return tripRepo.save(trip);
    }

    @Override
    public void deleteTrip(long id) {
        tripRepo.deleteById(id);
    }

    @Override
    public Trip updateTrip(long id, Trip newTrip) {
        Trip oldTrip = getTrip(id);
        oldTrip.setStartDate(newTrip.getStartDate());
        oldTrip.setEndDate(newTrip.getEndDate());
        oldTrip.setCity(newTrip.getCity());
        oldTrip.setRate(newTrip.getRate());
        oldTrip.setReview(newTrip.getReview());
        return tripRepo.save(oldTrip);
    }
}
