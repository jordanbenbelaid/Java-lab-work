package com.example.firstSpringDemo.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity 			//jpa + hibernate will auto-create a table for this class
public class Demo {

		//Using ducks as example
	
	//Validation rules specify what can and cant be processed in our DB
	
	@Id			//auto-incrementing
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@NotNull
	private String colour;
	
	@NotNull
	private String habitat;
	
	@Min(0)
	@Max(50)
	private int age;
	
	public Demo() {
		
	}
	
	public Demo(String name, String colour, String habitat, int age) {
		super();
		this.name = name;
		this.colour = colour;
		this.habitat = habitat;
		this.age = age;
	}
	
	public Demo(int id, String name, String colour, String habitat, int age) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.habitat = habitat;
		this.age = age;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((habitat == null) ? 0 : habitat.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override 		//very important for testing, compares content rather than reference
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		if (age != other.age)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (habitat == null) {
			if (other.habitat != null)
				return false;
		} else if (!habitat.equals(other.habitat))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
