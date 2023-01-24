package com.technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.SmartGarage.entity.Mechanic;
@Repository
public interface MechanicRepository  extends JpaRepository<Mechanic, Long>{

}
