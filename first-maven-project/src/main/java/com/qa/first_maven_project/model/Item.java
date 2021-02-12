package com.qa.first_maven_project.model;

public class Item {

		private String name;
		private String category;
		private Double price;
		
		public Item(){
			
		}
		
		public Item(String name, String category, Double price) {
			this.name = name;
			this.category = category;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		
		
}
