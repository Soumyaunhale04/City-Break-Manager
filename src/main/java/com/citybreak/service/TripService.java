package com.citybreak.service;
import com.citybreak.domain.Trip;

import java.util.List;

public interface TripService {
    Trip getTrip(long id);
    List<Trip> getAllTrips();
    Trip addTrip(Trip trip);
    void deleteTrip(long id);
    Trip updateTrip(long id, Trip newTrip);
}
