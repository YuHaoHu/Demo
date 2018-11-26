package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringService {

	@RequestMapping("/hello")
	public String name() {
		return "Hello world";
	}
}
