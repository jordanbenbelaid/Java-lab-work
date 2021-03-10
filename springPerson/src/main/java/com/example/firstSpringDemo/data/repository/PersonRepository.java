package com.example.firstSpringDemo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.firstSpringDemo.data.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
