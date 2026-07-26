package com.javafullstack.neha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {
	@GetMapping
	public String hello() {
		return "Hello Neha Mausi hello";
	}
	
	@GetMapping("/hello")
	public String world() {
		return "Hello Neha Mausi world";
	}
	
	@GetMapping("/neha")
	public String neha() {
		return "Hello Neha Mausi Neha Maurya";
	}
	
} 
