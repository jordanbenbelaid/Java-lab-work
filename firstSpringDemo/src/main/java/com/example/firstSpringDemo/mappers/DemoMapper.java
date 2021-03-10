package com.example.firstSpringDemo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.firstSpringDemo.DTO.DemoDTO;
import com.example.firstSpringDemo.data.model.Demo;

@Component
public class DemoMapper {
	
	private ModelMapper modelMapper;
	
	@Autowired
	public DemoMapper(ModelMapper modelMapper) {
		this.modelMapper = modelMapper;
	}
	
	public DemoDTO mapToDTO(Demo demo) {
		return this.modelMapper.map(demo, DemoDTO.class);
	}
	
	public DemoDTO mapToDTO(DemoDTO demoDTO) {
		return this.modelMapper.map(demoDTO, DemoDTO.class);
	}
}
