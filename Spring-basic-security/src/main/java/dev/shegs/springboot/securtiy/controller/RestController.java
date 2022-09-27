package dev.shegs.springboot.securtiy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest/auth")
public class RestController {
	
	@GetMapping("/getmsg")
	public String greeting() {
		return "spring security working";
	}

}
