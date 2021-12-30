package com.spring.example.service;

import java.util.List;
import java.util.Optional;

import com.spring.example.model.Trip;

public interface TripService {
	
	
	public List<Trip> getAllTrips();
	public String insertTrip(Trip trip);
	public String deleteTrip(int trip_id);
	public Optional<Trip> searchById(int trip_id);

}


