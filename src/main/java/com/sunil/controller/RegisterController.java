package com.sunil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

	
	@GetMapping("/register")
	public String getRegister() {
		return "register display";
	}
}
