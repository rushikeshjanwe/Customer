package com.rushi.service;

import java.util.List;
import java.util.Optional;

import com.rushi.entity.Customers;



public interface CustomerService {
	
	public List<Customers> saveAll();
	
	public List<Customers> findAll();
	
	public  Optional<Customers> getId(Integer id);
	
	public Customers upsert(Customers customers);
	
	public void patch(Integer id); 
	
	public  void delete(Integer id);

	

}
