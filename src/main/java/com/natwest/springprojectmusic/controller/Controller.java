package com.natwest.springprojectmusic.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class Controller {

	@GetMapping("/test")
	public String test() {
		return "Back to testing on Postman";
	}
	
	@PostMapping("/create")
			public ResponseEntity<Music> create(){
			return new ResponseEntity<Music>( body, HttpStatus.CREATED);
	
	}
	
	@GetMapping("/read")
	public ResponseEntity<List<Music>> read() {
		
		return new ResponseEntity<List<Music>>( body, HttpStatus.OK);
	}
	
	@PutMapping("/replace/{id")
	public ResponseEntity<Music> update(@PathVariable Long id, @RequestBody Music ms) {
		return new ResponseEntity<Music>( body, HttpStatus.ACCEPTED)
	}
}