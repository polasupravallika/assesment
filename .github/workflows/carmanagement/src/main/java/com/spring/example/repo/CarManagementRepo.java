package com.spring.example.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.example.model.CarManagement;

@Repository
@Transactional

public interface CarManagementRepo extends JpaRepository<CarManagement,Integer> {

}
