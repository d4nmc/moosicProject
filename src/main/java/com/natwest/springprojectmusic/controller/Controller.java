package com.natwest.springprojectmusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.springprojectmusic.music.Music;
import com.natwest.springprojectmusic.service.MusicService;

@RestController
@RequestMapping("/music")
public class Controller {

	private MusicService service;
	
	@Autowired
	public Controller(MusicService service) {
		this.service = service;
	}
	
	@GetMapping("/test")
	public String test() {
		return "Back to testing on Postman";
	}
	
	@PostMapping("/create")
			public ResponseEntity<Music> create(@RequestBody Music ms){
			return new ResponseEntity<Music>(this.service.create(ms), HttpStatus.CREATED);
	
	}
	
	@GetMapping("/read")
	public ResponseEntity<List<Music>> read() {
		
		return new ResponseEntity<List<Music>>(this.service.read(), HttpStatus.OK);
	}
	
	@PutMapping("/replace/{id")
	public ResponseEntity<Music> update(@PathVariable Long id, @RequestBody Music ms) {
		return new ResponseEntity<Music>(this.service.update(id, ms), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
}
}