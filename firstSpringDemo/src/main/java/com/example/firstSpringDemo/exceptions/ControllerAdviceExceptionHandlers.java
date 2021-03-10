package com.example.firstSpringDemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// Indicates @ExceptionHandler, @InitBinder, or @ModelAttribute have been used on the methods
// inside this class. We are focused on @ExceptionHandler
//
// Applies to all registered controller beans
// - This is a global exception handler of sorts
@ControllerAdvice
public class ControllerAdviceExceptionHandlers {

	// Specifies the following method is for handling the specified exception
	@ExceptionHandler(value = DemoNotFoundException.class)
	public ResponseEntity<String> demoNotFoundExceptionHandler(DemoNotFoundException dnfe) {
		// Spring automatically passes the exception to our method parameter
		return new ResponseEntity<String>(dnfe.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	// Specifies the following method is for handling the specified exception
	@ExceptionHandler(value = FunnyDemoNotFoundException.class)
	public ResponseEntity<String> funnyDemoNotFoundExceptionHandler(FunnyDemoNotFoundException fdnfe) {
		// Spring automatically passes the exception to our method parameter
		return new ResponseEntity<String>(fdnfe.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	// Specifies the following method is for handling the specified exception
	@ExceptionHandler(value = RudeDemoNotFoundException.class)
	public ResponseEntity<String> rudeDemoNotFoundExceptionHandler(RudeDemoNotFoundException rdnfe) {
		// Spring automatically passes the exception to our method parameter
		return new ResponseEntity<String>(rdnfe.getMessage(), HttpStatus.NOT_FOUND);
	}
}
