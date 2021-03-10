package com.example.firstSpringDemo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.data.model.Demo;
import com.example.firstSpringDemo.data.repository.DemoRepository;
import com.example.firstSpringDemo.mappers.DemoMapper;

@SpringBootTest
public class DemoServiceUnitTest {

		@Autowired
		private DemoService demoService;
		
		@MockBean
		private DemoRepository demoRepository;
		
		@MockBean
		private DemoMapper demoMapper;
		
		private List<Demo> demos;
		
		private List<DemoDTO> demoDTOs;
		
		private Demo validDemo;
		private DemoDTO validDemoDTO;
		
		@BeforeEach
		public void init() {
			validDemo = new Demo(1, "bob", "red", "pond", 4);
			validDemoDTO = new DemoDTO(1, "bob", "red", "pond");
			
			demos = new ArrayList<Demo>();
			demoDTOs = new ArrayList<DemoDTO>();
			
			demos.add(validDemo);
			demoDTOs.add(validDemoDTO);
		}
		
		@Test
		public void readAllDemosTest() {
			when(demoRepository.findAll()).thenReturn(demos);
			when(demoMapper.mapToDTO(validDemo)).thenReturn(validDemoDTO);
			
			assertThat(demoDTOs).isEqualTo(demoService.readAllDemos());
			
			verify(demoRepository, times(1)).findAll();
			verify(demoMapper, times(1)).mapToDTO(validDemo);
		}
		
		@Test
		public void readByIdTest(){
			when(demoRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(validDemo));
			when(demoMapper.mapToDTO(validDemo)).thenReturn(validDemoDTO);
			
			assertThat(validDemoDTO).isEqualTo(demoService.readById(Mockito.anyInt()));
			
			verify(demoRepository, times(1)).findById(Mockito.any());
			verify(demoMapper, times(1)).mapToDTO(validDemo);
		}
		
		@Test
		public void readByNameTest() {
			when(demoRepository.getDemoByNameJPQL()).thenReturn(validDemo);
			when(demoMapper.mapToDTO(validDemo)).thenReturn(validDemoDTO);
			
			assertThat(validDemoDTO).isEqualTo(demoService.readByName("bob"));
			
			verify(demoRepository, times(1)).getDemoByNameJPQL();
			verify(demoMapper, times(1)).mapToDTO(validDemo);
		}
		
		@Test
		public void createDemoTest() {
			when(demoRepository.save(validDemo)).thenReturn(validDemo);
			when(demoMapper.mapToDTO(validDemo)).thenReturn(validDemoDTO);
			
			assertThat(validDemoDTO).isEqualTo(demoService.createDemo(validDemo));
			
			verify(demoRepository, times(1)).save(validDemo);
			verify(demoMapper, times(1)).mapToDTO(validDemo);
		}
		
		@Test
		public void updateDemoTest() {
			
		}
		
		@Test
		public void deleteDemoTest() {
			
		}
}
