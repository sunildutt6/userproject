package com.sunil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.entity.Customer;
import com.sunil.repository.CustomerRepository;

@RestController
public class RegisterController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	
	@GetMapping("/register")
	public String getRegister() {
		return "register display";
	}
	
	@PostMapping("/register")
	public Customer registerCustomer(@RequestBody Customer customer) {
		String hasPwd = passwordEncoder.encode(customer.getPwd());
		customer.setPwd(hasPwd);
		return customerRepository.save(customer);
	}
}
