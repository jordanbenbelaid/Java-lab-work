package com.example.firstSpringDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.data.model.Demo;
import com.example.firstSpringDemo.data.repository.DemoRepository;
import com.example.firstSpringDemo.exceptions.FunnyDemoNotFoundException;
import com.example.firstSpringDemo.exceptions.RudeDemoNotFoundException;
import com.example.firstSpringDemo.mappers.DemoMapper;

@Service // labelled as bean (managed by spring)
public class DemoService {

	// data access object
	private DemoRepository demoRepository;
	private DemoMapper demoMapper;
	
	@Autowired
	public DemoService(DemoRepository demoRepository, DemoMapper demoMapper) {
		this.demoRepository = demoRepository;
		this.demoMapper = demoMapper;
	}

	public List<DemoDTO> readAllDemos() {
		List<Demo> demos = demoRepository.findAll();
		List<DemoDTO> demoDTOs = new ArrayList<DemoDTO>();
		
		demos.forEach(demo -> demoDTOs.add(demoMapper.mapToDTO(demo)));
		
		return demoDTOs;
	}

	public DemoDTO readById(int id) {
		Optional<Demo> demo = demoRepository.findById(id);

		if (demo.isPresent()) {
			return demoMapper.mapToDTO(demo.get());
		} else {
			throw new RudeDemoNotFoundException();
		}
	}
	
	public DemoDTO readByName(String name) {
		Demo demo = demoRepository.getDemoByNameJPQL();
		return demoMapper.mapToDTO(demo);
	}

	public DemoDTO createDemo(Demo demo) {
		Demo newDemo = demoRepository.save(demo);
		return demoMapper.mapToDTO(newDemo);
	}

	public DemoDTO updateDemo(int id, Demo demo) throws EntityNotFoundException {
		Optional<Demo> demoInDbOpt = demoRepository.findById(id);
		Demo demoInDb;
		
		if (demoInDbOpt.isPresent()) {
			demoInDb = demoInDbOpt.get();
		} else {
			throw new RudeDemoNotFoundException();
		}

		demoInDb.setName(demo.getName());
		demoInDb.setColour(demo.getColour());
		demoInDb.setAge(demo.getAge());
		demoInDb.setHabitat(demo.getHabitat());

		Demo updatedDemo = demoRepository.save(demoInDb);
		return demoMapper.mapToDTO(updatedDemo);
	}

	public void deleteDemo(int id) {
		if (!demoRepository.existsById(id)) {
			throw new FunnyDemoNotFoundException();
		}
		demoRepository.deleteById(id);
	}
}
