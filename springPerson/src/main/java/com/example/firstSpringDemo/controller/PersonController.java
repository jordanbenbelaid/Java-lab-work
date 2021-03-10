package com.example.firstSpringDemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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

import com.example.firstSpringDemo.data.model.Person;
import com.example.firstSpringDemo.services.PersonServices;

@RestController
@RequestMapping(path = "/person")
public class PersonController {

	private PersonServices personServices;
	
	@Autowired
	public PersonController(PersonServices personServices) {
		this.personServices = personServices;
	}
	
	@GetMapping
	public ResponseEntity<List<Person>> getAllPeople(){
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", "All People");
		
		List<Person> data = personServices.readAllPeople();
		
		return new ResponseEntity<List<Person>>(data, httpHeaders, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Person> getOnePerson(@PathVariable("id") int id){
		Person person = personServices.readById(id);
		
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Person> createPerson(@Valid @RequestBody Person person){
		Person newPerson = personServices.createPerson(person);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", String.valueOf(newPerson.getId()));
		
		return new ResponseEntity<Person>(newPerson, headers, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Person> updatePerson(@PathVariable("id") int id, @RequestBody Person person) {
		Person updatedPerson = personServices.updatePerson(id, person);
		return new ResponseEntity<Person>(updatedPerson, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deletePerson(@PathVariable("id") int id){
		return new ResponseEntity<Boolean>(personServices.deletePerson(id), HttpStatus.OK);
	}
}
