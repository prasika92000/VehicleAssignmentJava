package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		Car[] cars = { 
				new Car("Honda", 22.3, 22000),
				new Car("Ford", 20.8, 28000),
				new Car("Toyota", 25.5, 25000),
				new Car("Maruti",18.5,15000),
				new Car("Hundai",27.2,35000),
				
				};
		
		 System.out.println("Company\tMileage\tPrice");
		 for(Car car:cars) {
			 System.out.println(car.getCompanyName() + "\t" + car.getMileage() + "\t" + car.getPrice());
				 }
//		   int n = 3; // Number of cars
//
//	        Car[] cars = new Car[n];
//
//	        // Create car objects and add them to the array
//	        cars[0] = new Car("Toyota", 25.5, 25000);
//	        cars[1] = new Car("Honda", 22.3, 22000);
//	        cars[2] = new Car("Ford", 20.8, 28000);
//
//	        // Display details of all cars
//	        System.out.println("Company\tMileage\tPrice");
//	        for (int i = 0; i < n; i++) {
//	            Car car = cars[i];
//	            System.out.println(car.getCompanyName() + "\t" + car.getMileage() + "\t" + car.getPrice());
//	        }
	    }
	
	    }
	


