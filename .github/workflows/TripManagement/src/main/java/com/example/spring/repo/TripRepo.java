package com.example.spring.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.model.Trip;
@Repository
@Transactional

public interface TripRepo  extends JpaRepository<Trip,Integer>{ 

}
