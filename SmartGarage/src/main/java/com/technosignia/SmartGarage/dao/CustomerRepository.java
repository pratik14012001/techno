package com.technosignia.SmartGarage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technosignia.SmartGarage.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer ,Long> {

}
