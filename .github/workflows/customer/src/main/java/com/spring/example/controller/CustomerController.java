package com.spring.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.example.model.Customer;
import com.spring.example.service.CustomerService;

public class CustomerController {
	
	@Autowired
	CustomerService service;

	@GetMapping("/all")
	public List<Customer> getAll() {
		return service.getAllCustomer();
	}

	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {

		return service.insertCustomer(customer);
	}
	
	@DeleteMapping("/delete/{mobile}")
	public String deleteCustomer(@PathVariable int mobile) {
		
		return service.deleteCustomer(mobile);
		
	}
	
	


}
