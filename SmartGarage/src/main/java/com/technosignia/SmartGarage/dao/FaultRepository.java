package com.technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.technosignia.SmartGarage.entity.Fault;

 @SuppressWarnings("unused")
@Repository 
public interface FaultRepository extends JpaRepository<Fault , Long > {

}
