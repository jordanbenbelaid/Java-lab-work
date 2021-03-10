package com.example.firstSpringDemo.DTO;

public class DemoDTO {

		private int id;
		
		private String name;
		
		private String colour;
		
		private String habitat;
		
		public DemoDTO() {
			super();
		}

		public DemoDTO(int id, String name, String colour, String habitat) {
			super();
			this.id = id;
			this.name = name;
			this.colour = colour;
			this.habitat = habitat;
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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((colour == null) ? 0 : colour.hashCode());
			result = prime * result + ((habitat == null) ? 0 : habitat.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
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
			DemoDTO other = (DemoDTO) obj;
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
