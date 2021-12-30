package com.spring.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.repo.TripRepo;
import com.spring.example.model.Trip;
@Service
public class TripServiceImpl implements TripService {
	
	@Autowired
	TripRepo repo;



	@Override
	public List<Trip> getAllTrips() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insertTrip(Trip trip) {
		// TODO Auto-generated method stub
		repo.save(trip);
		return "car is regitred";
	}

	@Override
	public String deleteTrip(int trip_id) {
		// TODO Auto-generated method stub
		repo.deleteById(trip_id);
		return "person record deleted";
	}

	@Override
	public Optional<Trip> searchById(int trip_id) {
		// TODO Auto-generated method stub
		return repo.findById(trip_id);
	}

}
