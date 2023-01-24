package com.technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technosignia.SmartGarage.entity.Vehicle;
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}
