package com.sunil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

	
	@GetMapping("/about")
	public String getAbout() {
		return "about display";
	}
}
