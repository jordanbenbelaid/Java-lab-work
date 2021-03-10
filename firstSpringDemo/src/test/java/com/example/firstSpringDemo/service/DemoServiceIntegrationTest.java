package com.example.firstSpringDemo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.data.model.Demo;
import com.example.firstSpringDemo.data.repository.DemoRepository;
import com.example.firstSpringDemo.mappers.DemoMapper;

@SpringBootTest
public class DemoServiceIntegrationTest {

	@Autowired
	private DemoService demoService;

	@Autowired
	private DemoRepository demoRepository;

	@Autowired
	private DemoMapper demoMapper;

	private List<Demo> demos;
	private List<DemoDTO> demoDTOs;

	private Demo validDemo;
	private DemoDTO validDemoDTO;

	@BeforeEach
	public void init() {
		// setup our valid duck data to be saved to the db
		validDemo = new Demo(1, "bob", "red", "beach", 6);

		// initialise our lists
		demos = new ArrayList<Demo>();
		demoDTOs = new ArrayList<DemoDTO>();

		// Reset the state of the db before each test
		demoRepository.deleteAll();

		// prepopulate the db (get the saved duck back)
		validDemo = demoRepository.save(validDemo);
		
		// map the saved duck to a DTO
		validDemoDTO = demoMapper.mapToDTO(validDemo);

		// add the saved duck and corresponding DTO to the relevant lists
		demos.add(validDemo);
		demoDTOs.add(validDemoDTO);
	}

	@Test
	public void readAllDemosTest() {
		// Get all ducks stored in the db
		List<DemoDTO> demoInDb = demoService.readAllDemos();

		// compare to our expected values
		assertThat(demoDTOs).isEqualTo(demoInDb);
	}

	@Test
	public void createDemoTest() {
		//creating a new duck
		Demo newDemo = new Demo("lewis", "brown", "garden", 2);
		newDemo.setId(2);
		DemoDTO newDemoDTO = demoMapper.mapToDTO(newDemo);
		
		
		assertThat(newDemoDTO).isEqualTo(demoService.createDemo(newDemo));
	}
}
