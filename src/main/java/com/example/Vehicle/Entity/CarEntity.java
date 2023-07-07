package com.example.Vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "Car")

	public class CarEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String brand;
		private int price;
		private String colour;
		private int model;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public int getModel() {
			return model;
		}

		public void setModel(int model) {
			this.model = model;
		}

	}

