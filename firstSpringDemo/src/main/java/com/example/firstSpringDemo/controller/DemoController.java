package com.example.firstSpringDemo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstSpringDemo.service.DemoService;

import data.model.Demo;

@RestController 			//type of bean, convenience annotation for creatin restful controllers
							//Special version on @component, and it combines @Controller and @responsebody
							//it converts the response form the web to JSON
@RequestMapping(path = "/demo")
public class DemoController {
	
	//FIELD INJECTION
	@Autowired
	private DemoService demoService;
	
	//CONSTRUCTOR INJECTION
//	@Autowired
//	public DemoController(DemoService demoService) {
//		this.demoService = demoService; 	//we dont want to create this ourselves, so we pass it in bean method
//	}
	
//	@RequestMapping(path = "/", method = RequestMethod.GET) 		//old way of doing
	//localhost:8080/duck       getting all ducks method
	@GetMapping
	public ResponseEntity<List<Demo>> getAllDemos(){
		
		//response has headers, a body and status code
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Location", "1442");
		
		List<Demo> data = demoService.readAllDemos();
		//ResponseEntity body, headers, httpStatus
		return new ResponseEntity<List<Demo>>(data, httpHeaders, HttpStatus.OK);
	}
	
	//localhost:8080/duck/1 		shows duck with id 1 (e.g)
	//@pathVariable we use {} to show its a path variable, must match parameter of method
	//the path variable transfers data in our url into information
	
	//getting a specific duck
	@GetMapping("/{id}")
	public ResponseEntity<Demo> getDemoById(@PathVariable("id") int id) throws Exception{
		Demo demo = demoService.readById(id);
		
		return new ResponseEntity<Demo>(demo, HttpStatus.OK);
	}
	
	//localhost:8080/duck/alt?id=1 		(Eg)
	//getting a specific duck
	@GetMapping("/alt")
	public ResponseEntity<Demo> getDuckByIdAlt(@PathParam("id") int id) throws Exception{
		Demo demo = demoService.readById(id);
		return new ResponseEntity<Demo>(demo, HttpStatus.OK);
	}
	
	//creating a new duck
	@PostMapping
	public ResponseEntity<Demo> createDemo(@RequestBody Demo demo){
		Demo newDemo = demoService.createDemo(demo);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", String.valueOf(newDemo.getId()));
		return new ResponseEntity<Demo>(demo, headers, HttpStatus.CREATED);
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<Demo> updateDemo(@PathVariable("id") int id, @RequestBody Demo demo){
		Demo updateDemo = demoService.updateDemo(id, demo);
		
		return new ResponseEntity<Demo>(updateDemo, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteDemo(@PathVariable("id") int id){
		demoService.deleteDemo(id);
		
		return new ResponseEntity<String>("Duck deleted", HttpStatus.OK);
	}
	
	
	//@PostMapping 		create something
	//@PutMapping 		generalised update
	//@GetMapping 		gets something
	//@PatchMapping 	update something
	//@DeleteMapping	deletes something
}
