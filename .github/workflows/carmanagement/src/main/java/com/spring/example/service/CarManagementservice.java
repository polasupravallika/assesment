package com.spring.example.service;

import java.util.List;

import com.spring.example.model.CarManagement;

public interface CarManagementservice {
	
	public List<CarManagement> getAllCars();
	public String insertCarManagement(CarManagement car);
	public String deleteCarManagement(int carno);
	public String dispalyAllCars();
	public String dispalyAllTrips();
	

}
