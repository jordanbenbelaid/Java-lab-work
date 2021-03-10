package com.example.firstSpringDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstSpringDemo.data.model.Person;
import com.example.firstSpringDemo.data.repository.PersonRepository;

@Service
public class PersonServices {

	private PersonRepository personRepository;
	
	@Autowired
	public PersonServices(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public List<Person> readAllPeople(){
		List<Person> people = personRepository.findAll();
		
		return people;
	}
}
