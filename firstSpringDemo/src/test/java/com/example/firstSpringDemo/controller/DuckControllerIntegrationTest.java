package com.example.firstSpringDemo.controller;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.data.model.Demo;
import com.example.firstSpringDemo.mappers.DemoMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) 	//we actually open the server here
@AutoConfigureMockMvc 		//configures mockmvc object(used to send requests to api)
@Sql(scripts = {"classpath:test-schema.sql", "classpath:test-data.sql"}, 
		executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
public class DuckControllerIntegrationTest {

	@Autowired
	private MockMvc mvc; 		//we use this to send http request
	
	@Autowired
	private DemoMapper demoMapper;
	
	@Autowired
	private ObjectMapper objectMapper; 		//convert to and from JSON
	
	private Demo demos = new Demo(1, "Freddy", "Red", "Beach", 3);
	private DemoDTO demoDTO = new DemoDTO(1, "Freddy", "Red", "Beach");
	
	private List<Demo> validDemo = List.of(demos);
	private List<DemoDTO> validDemoDTOs = List.of(demoDTO);

	@Test
	public void createDuckTest() throws Exception {
		Demo demoToSave = new Demo("Bob", "Green", "House", 1);
		DemoDTO expectedDemo = new DemoDTO(2, "Bob", "Green", "House");
		
		//created mock request to send  REQUEST
		MockHttpServletRequestBuilder mockRequest = 
				MockMvcRequestBuilders.request(HttpMethod.POST, "/duck");
		
		//Speficy the data to be sent and type of data
		mockRequest.contentType(MediaType.APPLICATION_JSON);
		mockRequest.content(objectMapper.writeValueAsString(demoToSave));
		
		//specify what data type we expect 
		mockRequest.accept(MediaType.APPLICATION_JSON);
		
		//setup result matcher
		ResultMatcher statusMatcher = MockMvcResultMatchers.status().isCreated();
		
		//expecting json returned in response body to be equal to string specified
		ResultMatcher contentMatcher = MockMvcResultMatchers.content()
				.json(objectMapper.writeValueAsString(expectedDemo));
		
		ResultMatcher headerMatcher = MockMvcResultMatchers.header().string("Location", "2");
		
		//send request and assert the expected results from result matchers
		mvc.perform(mockRequest)
		.andExpect(headerMatcher)
		.andExpect(contentMatcher)
		.andExpect(statusMatcher);
	}
}
