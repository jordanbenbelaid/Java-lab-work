package com.example.firstSpringDemo.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Min(0)
	private int age;
	
	private float height;
	
	private String hairColour;
	
	@NotNull
	@Column(unique = true)
	private String secrets;
	
	public Person() {
		
	}

	public Person(int id, String name, @Min(0) int age, float height, String hairColour, @NotNull String secrets) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.hairColour = hairColour;
		this.secrets = secrets;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public String getSecrets() {
		return secrets;
	}

	public void setSecrets(String secrets) {
		this.secrets = secrets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((hairColour == null) ? 0 : hairColour.hashCode());
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((secrets == null) ? 0 : secrets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (hairColour == null) {
			if (other.hairColour != null)
				return false;
		} else if (!hairColour.equals(other.hairColour))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (secrets == null) {
			if (other.secrets != null)
				return false;
		} else if (!secrets.equals(other.secrets))
			return false;
		return true;
	}
	
}
