package com.spring.example.service;

import java.util.List;


import com.spring.example.model.Customer;

public interface CustomerService {
	
	
	public List<Customer> getAllCustomer();
	public String insertCustomer(Customer customer);
	public String deleteCustomer(int mobile);
	
	

	

}
