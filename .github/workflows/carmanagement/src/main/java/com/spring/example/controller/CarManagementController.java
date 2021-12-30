package com.spring.example.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.example.model.CarManagement;
@RestController
public class CarManagementController {
	@Autowired
	 CarManagementervice service;

	@GetMapping("/all")
	public List<CarManagement> getAllCars() {
		return service.getAllCars();
	}

	@PostMapping("/add")
	public String addPerson(@RequestBody CarManagement car) {

		return service.insertPerson(car);
	}
	
	@DeleteMapping("/delete/{carno}")
	public String deletePerson(@PathVariable Integer carno) {
		
		return service.deletecarno(carno);
	}
		@GetMapping("/all")
		public List<CarManagement> getAlllTrips() {
			return service.getAllTrips();

		
	}
	
	}




