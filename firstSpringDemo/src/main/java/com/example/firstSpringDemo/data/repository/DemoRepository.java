package com.example.firstSpringDemo.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.firstSpringDemo.data.model.Demo;


//This is our DAO (data access object) where we write all our queries
@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer>{

	//derived queries are derived from their method names
	//spring data JPA converts method name to query
	//find duck by name 		findBy = SELECT
	public Demo findByName(String name);
	
	
	//Native queries use a specific SQL vendors syntax
	//we sue @Query annotation to write a native query
	@Query(value = "SELECT * FROM DEMO", nativeQuery = true)
	public List<Demo> getAllDemosSQL();
	
	//JPQL - Java Persistence Query Language
	//java's own query language, database independent
	//can use objects in our queries
	@Query("SELECT d from Demo d")
	public List<Demo> getAllDemosJPQL();
	
	
	//JPQL and Native queries can be passed parameters in the same way
	@Query("SELECT d FROM Demo d WHERE d.name = ?1")
	public Demo getDemoByNameJPQL();
}
