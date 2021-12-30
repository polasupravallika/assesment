package com.spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.example.model.CarManagement;
import com.spring.example.repo.CarManagementRepo;

public class CarManagementServiceImpl implements CarManagementservice{
	@Autowired
	CarManagementRepo repo;

	@Override
	public List<CarManagement>getAllCars() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insertCarManagement(CarManagement car) {
		// TODO Auto-generated method stub
		repo.save(car);
		return "added a new car"  ;
	}

	@Override
	public String deleteCarManagement(int carno) {
		// TODO Auto-generated method stub
		repo.deleteById(carno);
		return "car is deleted" ;
	}

	@Override
	public String dispalyAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dispalyAllTrips() {
		// TODO Auto-generated method stub
		return null;
	}
		
	

}
