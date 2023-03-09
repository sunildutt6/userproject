package com.sunil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.entity.Customer;
import com.sunil.repository.CustomerRepository;

@RestController
public class LoginController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@GetMapping("/login")
	public String getLogin() {
		return "login display";
	}
	
	@PostMapping("/register")
	public Customer registerCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}

}
