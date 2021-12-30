package com.spring.example.demo3;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.car.demo3")
public class CarMangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarMangementApplication.class, args);
	}

}
