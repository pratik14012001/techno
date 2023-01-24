package com.technosignia.SmartGarage.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
   
	@Id
 @GeneratedValue(strategy = GenerationType.AUTO)
Long id;

String vehicleName;

 Integer vehicleNumber;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getVehicleName() {
	return vehicleName;
}

public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}

public Integer getVehicleNumber() {
	return vehicleNumber;
}

public void setVehicleNumber(Integer vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
}


