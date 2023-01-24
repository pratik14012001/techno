package com.technosignia.SmartGarage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technosignia.SmartGarage.dao.CustomerRepository;
import com.technosignia.SmartGarage.entity.Customer;

@Service 
public class CustomerService {

	@Autowired 
	CustomerRepository customerRepository;
	public Customer createCustomer(Customer cust ) {
		
		return customerRepository.save(cust);
		
		
	}
	public Optional<Customer> getCustomerByID(long id) {
		Optional<Customer> opCust =customerRepository.findById(id);
		
			return opCust;
	}
	
public Customer updateCustomer(Long id, Customer customer) {
	Optional<Customer> dbOPCustomer =customerRepository.findById(id);
	
	Customer dbcustomer = dbOPCustomer.get();
	//dbcustomer.setAdress(customer.getAdress());
	dbcustomer.setId(customer.getId());
	return customerRepository.save(dbcustomer);
}
public String deleteCustomerById(Long id) {
	Optional<Customer> dbOPcustomer = customerRepository.findById(id);
	if(dbOPcustomer.isPresent()) {
		
		customerRepository.deleteById(id);
		return "A record delete successfully !!";
	}else {
		return "A record already deleted !!";
	}
}
}
