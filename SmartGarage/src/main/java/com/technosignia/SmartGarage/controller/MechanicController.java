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

import com.technosignia.SmartGarage.entity.Mechanic;
import com.technosignia.SmartGarage.service.MechanicService;

@RestController
public class MechanicController {
	
	@Autowired
	MechanicService mechanicService;
	
	
	@PostMapping("/mechanic")
	public Mechanic createMechanic(@RequestBody Mechanic mech)
	{
		return mechanicService.createMechanic(mech);
	}
	 @GetMapping("/mechanic")
	 public Optional<Mechanic> getMechanic(@RequestParam Long id) {

	 	return mechanicService.getMechanicById(id);
	 }
	   @PutMapping("/mechanic/{id}")
	 public Mechanic updateMechanicDetailsById(@PathVariable Long id,@RequestBody Mechanic mechanic)
	 {
	 	return mechanicService.updateMechanic(id,mechanic);

	 }
	   @DeleteMapping("/mechanic/{id}")
	 public String deleteMechanicById(@PathVariable Long id) {
	 	return mechanicService.deleteMechanicById(id);
	 }
	 }
	 