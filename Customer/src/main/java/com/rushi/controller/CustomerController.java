package com.rushi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rushi.entity.Customers;
import com.rushi.service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<Customers> customer() {
		return customerService.saveAll();
	}

	@GetMapping("/customers")
	public List<Customers> customers() {
		return customerService.findAll();
	}
	
	
	@GetMapping("/customers/{id}")
	public Optional<Customers> byId(@PathVariable Integer id){
		return customerService.getId(id);
	}
	
	@PostMapping("/customers/add")
	public Customers add(@RequestBody Customers customers) {
		return customerService.upsert(customers);
	}
	
	@PutMapping("/customers/update")
	public Customers update(@RequestBody Customers customers) {
		return customerService.upsert(customers);
	}
	
	
	@PatchMapping("/patch/{id}")
	public void patch(@PathVariable Integer id) {
		customerService.patch(id);
	}
	
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id){
		 customerService.delete(id);
	}
}
