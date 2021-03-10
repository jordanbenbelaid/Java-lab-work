package com.example.firstSpringDemo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.firstSpringDemo.data.model.Pond;

@Repository
public interface PondRepository extends JpaRepository<Pond, Integer>{

}
