package com.qa.main;

import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		
		Fruit();
		
	}
	
	public static void Fruit() {
		
		HashSet<String> fruit = new HashSet<String>();
		
		fruit.add("Pineapple");
		fruit.add("Apple");
		fruit.add("Pear");
		fruit.add("Tomato");
		
		fruit.forEach(i -> System.out.println(i));
	}
	
}
