package com.spring.example.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name="carmanagement")
public class CarManagement {
	@Id
	Integer carno;
	@Column
	String car_owner;
	@Column
	String fueltype;
	@Column
	Integer no_of_seats;
	@Column
	String model;
	public CarManagement(Integer carno, String car_owner, String fueltype, Integer no_of_seats, String model) {
		super();
		this.carno = carno;
		this.car_owner = car_owner;
		this.fueltype = fueltype;
		this.no_of_seats = no_of_seats;
		this.model = model;
	}
	public Integer getCarno() {
		return carno;
	}
	public void setCarno(Integer carno) {
		this.carno = carno;
	}
	public String getCar_owner() {
		return car_owner;
	}
	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public Integer getNo_of_seats() {
		return no_of_seats;
	}
	public void setNo_of_seats(Integer no_of_seats) {
		this.no_of_seats = no_of_seats;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

}
