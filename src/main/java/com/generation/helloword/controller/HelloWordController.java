package com.generation.helloword.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {
		
	@GetMapping
	public String helloWorld() {
		return "Persistencia!";
	}
}
