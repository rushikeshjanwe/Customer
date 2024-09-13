package com.rushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rushi.service.CustomerService;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomerApplication.class, args);
		
		CustomerService customerService = context.getBean(CustomerService.class);
		
		customerService.saveAll();
	}

}
