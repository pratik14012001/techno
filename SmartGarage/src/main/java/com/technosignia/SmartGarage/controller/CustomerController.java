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

import com.technosignia.SmartGarage.entity.Customer;
import com.technosignia.SmartGarage.service.CustomerService;

@RestController 
public class CustomerController {

	@Autowired 
	CustomerService customerService;
	
	@PostMapping ("/customer") 
	public Customer createCustomer(@RequestBody Customer customer ) {
		
		
		return customerService.createCustomer(customer );
	}
	
	
  @GetMapping("/customer")
public Optional<Customer> findCustomerById(@RequestParam Long id) {

	return customerService.getCustomerByID(id);
}
  @PutMapping("/customer/{id}")
public Customer updateCustomerDetailsById(@PathVariable Long id,@RequestBody Customer customer)
{
	return customerService.updateCustomer(id,customer);

}
  @DeleteMapping("/customer/{id}")
public String deleteCustomerById(@PathVariable Long id) {
	return customerService.deleteCustomerById(id);
}
}