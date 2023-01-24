package com.technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.SmartGarage.dao.MechanicRepository;
import com.technosignia.SmartGarage.entity.Mechanic;

@Service
public class MechanicService {
	
	@Autowired
	MechanicRepository mechanicRepository;
	
	
	public Mechanic createMechanic ( Mechanic mech)
	{
		return mechanicRepository.save(mech);
	}
	public Optional<Mechanic> getMechanicById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mechanic updateMechanic(Long id, Mechanic mechanic) {
		Optional<Mechanic> dbOPMechanic =mechanicRepository.findById(id);
		
		Mechanic dbOPmechanic = dbOPMechanic.get();
		dbOPmechanic.setAddress(mechanic.getAddress());
		dbOPmechanic.setId(mechanic.getId());
		return mechanicRepository.save(dbOPmechanic);
	}
	public String deleteMechanicById(Long id) {
		Optional<Mechanic> dbOPmechanic = mechanicRepository.findById(id);
		if(dbOPmechanic.isPresent()) {
			
			mechanicRepository.deleteById(id);
			return "A record delete successfully !!";
		}else {
			return "A record already deleted !!";
		}
	}
	}

