package com.example.firstSpringDemo.data.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Pond {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pond_id")
	private int id;
	
	@Column(name = "name", unique = true)
	private String name;

	//mappedBy indicates this is the inverse of the relationship(not he object)
	@OneToMany(mappedBy = "pond", fetch = FetchType.LAZY)
	@OnDelete(action = OnDeleteAction.CASCADE) 			//when a pond is deleted,delete all children (all ducks in pond)
	private List<Demo> demos;	
	
	public Pond() {
		
	}
	
	public Pond(String name) {
		super();
		this.name = name;
	}
	
	public Pond(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Pond(int id, String name, List<Demo> demos) {
		super();
		this.id = id;
		this.name = name;
		this.demos = demos;
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
	
	public List<Demo> getDemos() {
		return demos;
	}

	public void setDemos(List<Demo> demos) {
		this.demos = demos;
	}

	@Override
	public String toString() {
		return "Pond [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

		//without this, only memeory addresses will be compared and no tdata in the object
	//necessary fo rtesting to function properly
	//overriding this method from the supertype of all objects, Object
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pond other = (Pond) obj;
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
