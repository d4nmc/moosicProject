package com.natwest.springprojectmusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class Controller {

	@GetMapping("/test")
	public String test() {
		return "Back to testing on Postman";
	}
	
	
}
