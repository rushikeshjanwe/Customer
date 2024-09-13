package com.rushi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushi.entity.Customers;

public interface CustomerRepo extends JpaRepository<Customers, Integer>{

}
