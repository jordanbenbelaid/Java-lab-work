package com.example.firstSpringDemo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.model.Demo;
import data.repository.DemoRepository;
import exceptions.FunnyDemoNotFoundException;
import exceptions.RudeDemoNotFoundException;

@Service // labelled as bean (managed by spring)
public class DemoService {

	// data access object
	private DemoRepository demoRepository;

	@Autowired
	public DemoService(DemoRepository demoRepository) {
		this.demoRepository = demoRepository;
	}

	public List<Demo> readAllDemos() {
		List<Demo> demos = demoRepository.findAll();
		return demos;
	}

	public Demo readById(int id) {
		Optional<Demo> demo = demoRepository.findById(id);

		if (demo.isPresent()) {
			return demo.get();
		} else {
			throw new RudeDemoNotFoundException();
		}
	}

	public Demo createDemo(Demo demo) {
		Demo newDemo = demoRepository.save(demo);
		return newDemo;
	}

	public Demo updateDemo(int id, Demo demo) throws EntityNotFoundException {
		Demo updateDemo = demoRepository.getOne(id);

		updateDemo.setName(demo.getName());
		updateDemo.setColour(demo.getColour());
		updateDemo.setAge(demo.getAge());
		updateDemo.setHabitat(demo.getHabitat());

		return updateDemo;
	}

	public void deleteDemo(int id) {
		if (!demoRepository.existsById(id)) {
			throw new FunnyDemoNotFoundException();
		}
		demoRepository.deleteById(id);
	}
}
