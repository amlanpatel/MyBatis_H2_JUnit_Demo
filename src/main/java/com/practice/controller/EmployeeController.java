package com.practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class EmployeeController {
	
	@RequestMapping("/home")
	public String welcome() {
		return "Welcome Home !";
	}
}
