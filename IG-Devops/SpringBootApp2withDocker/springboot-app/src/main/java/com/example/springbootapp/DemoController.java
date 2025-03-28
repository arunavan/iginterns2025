package com.example.springbootapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/welcome")
	public String sayWelcome() {
		  return "Welcome to Docker with SpringBoot";
	}

}
