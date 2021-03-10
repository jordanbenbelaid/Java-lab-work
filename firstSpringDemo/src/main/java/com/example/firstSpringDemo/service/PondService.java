package com.example.firstSpringDemo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstSpringDemo.data.model.Pond;
import com.example.firstSpringDemo.data.repository.PondRepository;
import com.example.firstSpringDemo.mappers.PondMapper;

@Service
public class PondService {

	private PondRepository pondRepository;
	
	private PondMapper pondMapper;
	
	@Autowired
	public PondService(PondRepository pondRepository, PondMapper pondMapper) {
		this.pondRepository = pondRepository;
		this.pondMapper = pondMapper;
	}
	
	public List<Pond> readAllPonds(){		
		return this.pondRepository.findAll();
	}
	
	public Pond createPond(Pond pond) {
		Pond savedPond = pondRepository.save(pond);
		return savedPond;
	}
	
	public Boolean deletePond(Integer id) {
		if(pondRepository.existsById(id)) {
			pondRepository.deleteById(id);
		} else {
			throw new EntityNotFoundException();
		}
		boolean doesItExistStill = pondRepository.existsById(id);
		return !doesItExistStill;
	}
}
