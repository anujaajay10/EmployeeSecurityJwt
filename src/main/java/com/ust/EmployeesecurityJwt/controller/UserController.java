package com.ust.EmployeesecurityJwt.controller;

import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.EmployeesecurityJwt.entity.AuthRequest;

@RestController

public class UserController {
	@Autowired
	private ExecutorService service;
	@GetMapping("/welcome")
	public String welcome() {
		return "HI Welcome to UST";
		
	}
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authrequest) {
		return null;
	}

}
