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
		validDemo = new Demo(1, "bob", "red", "beach", 6);
		
		demos = new ArrayList<Demo>();
		demoDTOs = new ArrayList<DemoDTO>();
		
		demoRepository.deleteAll();
		demoRepository.save(validDemo);
		
		validDemo = demoRepository.save(validDemo);
		validDemoDTO = demoMapper.mapToDTO(validDemo);
		
		demos.add(validDemo);
		demoDTOs.add(validDemoDTO);
	}
	
	@Test
	public void readAllDemosTest() {
		List<DemoDTO> demoInDb = demoService.readAllDemos();
		
		assertThat(demoDTOs).isEqualTo(demoInDb);
	}
}
