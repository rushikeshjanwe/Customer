package com.rushi.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rushi.entity.Customers;
import com.rushi.repo.CustomerRepo;


@Service
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public CustomerServiceImp(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customers> saveAll() {
		Customers c=new Customers("Rushikesh",24);
		Customers c2=new Customers("Abhi",21);
		Customers c3=new Customers("Ram",28);
		
		List<Customers> asList = Arrays.asList(c,c2,c3);
		return customerRepo.saveAll(asList);
		
	}

	@Override
	public List<Customers> findAll() {
		return customerRepo.findAll();
	}

	@Override
	public Optional<Customers> getId(Integer id) {
		return customerRepo.findById(id);
	}

	@Override
	public Customers upsert(Customers customers) {
		return customerRepo.save(customers);
	}

	@Override
	public void patch(Integer id) {
		 customerRepo.findById(id);
	}
	
	@Override
	public void delete(Integer id) {
	  customerRepo.deleteById(id);
	

	
	}
 

	

	

}
