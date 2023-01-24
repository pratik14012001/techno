package com.technosignia.SmartGarage.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.SmartGarage.entity.Vehicle;
import com.technosignia.SmartGarage.service.VehicleService;

@RestController
public class VehicleController {

	
	@Autowired
	public VehicleService vehicleService;
	
	@PostMapping("/vehicle")
	public Vehicle createVehicle(@RequestBody Vehicle veh)
	{
		return vehicleService.createVehicle(veh);
	}
	 @GetMapping("/vehicle")
	 public Optional<Vehicle> getVehicleDetails(@RequestBody Vehicle veh,@RequestParam Long id) {

		return vehicleService.findVehicleById(id);
	 }
	   @PutMapping("/vehicle/{id}")
	 public Vehicle updateVehicleDetails(@RequestBody Vehicle veh,@PathVariable Long id)
	 {
	
		return vehicleService.updateVehicleDetails(id, veh);

	 }
	   @DeleteMapping("/vehicle/{id}")
	 public String deleteVehicleDetails(@PathVariable Long id) {

		return vehicleService.deleteVehicleDetails(id);
	   }
	 }
	 

