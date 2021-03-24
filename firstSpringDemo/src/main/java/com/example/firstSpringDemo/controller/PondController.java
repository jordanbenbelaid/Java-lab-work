package com.example.firstSpringDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.data.model.Demo;
import com.example.firstSpringDemo.data.model.Pond;
import com.example.firstSpringDemo.service.PondService;

@RestController	
@RequestMapping(path = "/pond")
public class PondController {

	private PondService pondService;
	
	@Autowired
	public PondController(PondService pondService) {
		this.pondService = pondService;
	}
	
	@GetMapping
	public ResponseEntity<List<Pond>> getAllPonds(){
		
		List<Pond> data = pondService.readAllPonds();
		//ResponseEntity body, headers, httpStatus
		return new ResponseEntity<List<Pond>>(data, HttpStatus.OK);
	}
	
	//creating a new pond
		@PostMapping
		public ResponseEntity<Pond> createPond(@RequestBody Pond pond){
			Pond newPond = pondService.createPond(pond);
			
			HttpHeaders headers = new HttpHeaders();
			headers.add("Location", String.valueOf(newPond.getId()));
			
			return new ResponseEntity<Pond>(newPond, headers, HttpStatus.CREATED);
		}
		
		//deleting a pond
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> deleteDemo(@PathVariable("id") int id){
			pondService.deletePond(id);
			
			return new ResponseEntity<String>("Duck deleted", HttpStatus.OK);
		}
	
}
