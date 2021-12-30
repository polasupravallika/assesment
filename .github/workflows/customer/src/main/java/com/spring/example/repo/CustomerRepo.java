package com.spring.example.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.model.Customer;

@Repository
@Transactional


public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
