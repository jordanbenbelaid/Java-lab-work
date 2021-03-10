package com.example.firstSpringDemo.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.firstSpringDemo.data.model.Demo;
import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.service.DemoService;

@SpringBootTest
public class DemoControllerUnitTest {

	@Autowired
	private DemoController demoController;
	
	@MockBean
	private DemoService demoService;
	
	private List<Demo> demos;
	private List<DemoDTO> demoDTOs;
	
	private Demo validDemo;
	private DemoDTO validDemoDTO;
	
	@BeforeEach
	public void init() {
		validDemo = new Demo(3, "bob", "red", "beach", 6);
		validDemoDTO = new DemoDTO(3, "bob", "red", "beach");
		
		demos = new ArrayList<Demo>();
		demoDTOs = new ArrayList<DemoDTO>();
		
		demos.add(validDemo);
		demoDTOs.add(validDemoDTO);
	}
	
	@Test
	public void getAllDucksTest() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", "1442");
		
		when(demoService.readAllDemos()).thenReturn(demoDTOs);
		
		ResponseEntity<List<DemoDTO>> response = 
				new ResponseEntity<List<DemoDTO>>(demoDTOs, httpHeaders, HttpStatus.OK);
		
		assertThat(response).isEqualTo(demoController.getAllDemos());
		
		verify(demoService, times(1)).readAllDemos();
	}
	
	@Test
	public void createDuckTest() {
		when(demoService.createDemo(Mockito.any(Demo.class))).thenReturn(validDemoDTO);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", String.valueOf(validDemoDTO.getId()));
		
		ResponseEntity<DemoDTO> response = 
				new ResponseEntity<DemoDTO>(validDemoDTO, headers, HttpStatus.CREATED);
		
		assertThat(response).isEqualTo(demoController.createDemo(validDemo));
		
		verify(demoService, times(1)).createDemo(Mockito.any(Demo.class));
	}
	
	@Test
	public void deleteDuckTest() {
		//we mock delete duck
		when(demoService.deleteDemo(Mockito.any(Integer.class))).thenReturn(true);
		
		//expected response
		ResponseEntity<Boolean> response = new ResponseEntity<Boolean>(true, HttpStatus.OK);
		
		assertThat(response).isEqualTo(demoController.deleteDemo(validDemo.getId()));
		
		//checking our expected response is equal to the actual response of controller delete duck method
		verify(demoService, times(1)).deleteDemo(Mockito.any(Integer.class));
	}
	
	@Test
	public void updateDuckTest() {
		when(demoService.updateDemo(Mockito.any(Integer.class), Mockito.any())).thenReturn(validDemoDTO);
		
		ResponseEntity<DemoDTO> response = new ResponseEntity<DemoDTO>(validDemoDTO, HttpStatus.OK);
		
		assertThat(response).isEqualTo(demoController.updateDemo(validDemo.getId(), validDemo));
		
		verify(demoService, times(1)).updateDemo(Mockito.any(Integer.class), Mockito.any(Demo.class));
	}
}
