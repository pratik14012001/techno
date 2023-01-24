package com.technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.SmartGarage.dao.VehicleRepository;
import com.technosignia.SmartGarage.entity.Vehicle;
@Service
public class VehicleService {
	@Autowired
VehicleRepository vehicleRepository;
	
	public Vehicle createVehicle(Vehicle veh)
	{
	return vehicleRepository.save(veh);
	}
	public Optional<Vehicle> findVehicleById(Long id)
	{
	
	 return vehicleRepository.findById(id);
	}

	public Vehicle updateVehicleDetails(Long id, Vehicle veh) {
		Optional<Vehicle> dbOPVeh = vehicleRepository.findById(id);
		
		Vehicle dbVeh = dbOPVeh.get();
		
		
		 dbVeh.setId(veh.getId());
		dbVeh.setVehicleName(veh.getVehicleName());
		//dbVeh.setVehicleNumber(veh.getVehicleNumber())
		
		return vehicleRepository.save(veh);
	}
	
	public String deleteVehicleDetails(Long id) 
	{
		vehicleRepository.deleteById(id);
		return "A vehicle Record Deleted Successfully";
}
}
	

