package com.example.firstSpringDemo.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The duck is currently swimmig across the river")
public class FunnyDemoNotFoundException extends EntityNotFoundException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5635036068469421233L;

	public FunnyDemoNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FunnyDemoNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
