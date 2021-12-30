package com.spring.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="trip")

public class Trip {
	
	@Id
	int trip_id;
	@Column
	String car_no;
	@Column
	String source;
	public int getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(int trip_id) {
		this.trip_id = trip_id;
	}
	public String getCar_no() {
		return car_no;
	}
	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Column
	String customer_name;
	@Column
	String amount;
	public Trip(int trip_id, String car_no, String source, String customer_name, String amount) {
		super();
		this.trip_id = trip_id;
		this.car_no = car_no;
		this.source = source;
		this.customer_name = customer_name;
		this.amount = amount;
	}

}
