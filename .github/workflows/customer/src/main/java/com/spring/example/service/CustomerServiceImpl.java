package com.spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.model.Customer;
import com.spring.example.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepo repo;

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		
		return "customer registerd";
	}

	@Override
	public String deleteCustomer(int mobile) {
		// TODO Auto-generated method stub
		repo.deleteById(mobile);
		return "person record is deleted";
	}
}

