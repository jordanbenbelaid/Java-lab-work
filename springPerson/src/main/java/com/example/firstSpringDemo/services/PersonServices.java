package com.example.firstSpringDemo.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

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
	
	public Person readById(Integer id) {
		Optional<Person> person = personRepository.findById(id);
		if(person.isPresent()) {
			return person.get();
		} else {
			throw new EntityNotFoundException();
		}
	}
	
	public Person createPerson(Person person) {
		Person newPerson = personRepository.save(person);
		
		return newPerson;
	}
	
	public Person updatePerson(Person person) {
		Optional<Person> optionalPerson = personRepository.findById(person.getId());
		Person updatedPerson;
		
		if(optionalPerson.isPresent()) {
			updatedPerson = optionalPerson.get();
		} else {
			throw new EntityNotFoundException();
		}
		
		updatedPerson.setAge(person.getAge());
		updatedPerson.setHairColour(person.getHairColour());
		updatedPerson.setHeight(person.getHeight());
		updatedPerson.setName(person.getName());
		updatedPerson.setSecrets(person.getSecrets());
		
		updatedPerson = personRepository.save(updatedPerson);
		return updatedPerson;
	}
	
	public boolean deletePerson(Integer id) {
		if(!personRepository.existsById(id)) {
			throw new EntityNotFoundException();
		}
		personRepository.deleteById(id);
		
		boolean exists = personRepository.existsById(id);
		
		return !exists;
	}
}
