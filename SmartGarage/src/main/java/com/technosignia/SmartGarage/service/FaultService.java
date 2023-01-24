package com.technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.SmartGarage.dao.FaultRepository;
import com.technosignia.SmartGarage.entity.Fault;

@Service 
public class FaultService {

	@Autowired 
	FaultRepository faultRepository ;
	public Fault createFault(Fault fault) {
		return faultRepository.save(fault);
	}
	public Optional<Fault> getFaultById(Long id){
		Optional<Fault> opFault =faultRepository.findById(id);
		return opFault;
	}
	public Fault updateFaultdetails(Long id, Fault fault) {
		Optional<Fault> dbOPFault =faultRepository.findById(id);
		
		Fault dbFault = dbOPFault.get();
		dbFault.setF_no(fault.getF_no());
		dbFault.setId(fault.getId());
		return faultRepository.save(dbFault);
	}
	public String deleteFaultById(Long id) {
		Optional<Fault> dbOPfault = faultRepository.findById(id);
		if(dbOPfault.isPresent()) {
			
			faultRepository.deleteById(id);
			return "A record delete successfully !!";
		}else {
			return "A record already deleted !!";
		}
	}
}
