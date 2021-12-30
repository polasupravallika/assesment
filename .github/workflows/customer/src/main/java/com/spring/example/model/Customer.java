package com.spring.example.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Customer {
	public Customer(String customer_name, String address, Integer mono) {
		super();
		this.customer_name = customer_name;
		this.address = address;
		this.mobile = mono;
	}
	@Id
	int mobile;
	@Column
	String address;
	@Column
	String customer_name;
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getMono() {
		return mobile;
	}
	public void setMono(Integer mono) {
		this.mobile = mono;
	}
	

}
