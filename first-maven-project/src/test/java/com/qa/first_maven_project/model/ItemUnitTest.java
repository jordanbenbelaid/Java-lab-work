package com.qa.first_maven_project.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ItemUnitTest {
		
	@Test
	public void itemDefaultConstructorTest() {
		Item item = new Item();
		
		assertNotNull(item);
	}

	@Test
	public void itemGetNameTest() {
		String name = "Freddo";
		String category = "Chocolate";
		double price = 1.29;
		
		Item item = new Item(name, category, price);
		
		assertEquals(name, item.getName());
	}
	
	@Test
	public void itemAllArgsConstructorTest() {
		
		Item item = new Item("Jordan", "Name", 1.75);
		
		assertNotNull(item.getName());
		assertNotNull(item.getCategory());
		assertNotNull(item.getPrice());
		
		assertEquals(item.getName(), "Jordan");
		assertEquals(item.getCategory(), "Name");
		assertEquals(item.getPrice(), 1.75);
		//assertEquals(actual, expected); or other way round, depending on error message
	}
}
