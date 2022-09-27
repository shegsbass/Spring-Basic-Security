package dev.shegs.springboot.securtiy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController {
	
	@GetMapping("/sayhello")
	public String sayHello() {
		return "Hello there";
	}

}
