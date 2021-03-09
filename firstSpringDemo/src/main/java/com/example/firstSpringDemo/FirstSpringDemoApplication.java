package com.example.firstSpringDemo;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FirstSpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringDemoApplication.class, args);
		
		LocalTime time = context.getBean("localTime", LocalTime.class);
		System.out.println(time);
		
		LocalTime time2 = context.getBean("localTime", LocalTime.class);
		System.out.println(time2);
	}
	
	@Bean 		//indicates this is a bean controlled by string (added to the app context)
	@Scope("prototype") 		//or can be ("singleton")
	public static LocalTime localTime () {
		return LocalTime.now();
	}

}
