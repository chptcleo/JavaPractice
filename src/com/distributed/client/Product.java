package com.distributed.client;


import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 7699763393823629591L;

	private String description;

	private double price;

	private Warehouse location;

	public Product(String description, double price) {
		this.description = description;
		this.price = price;
	}

	public Warehouse getLocation() {
		return location;
	}

	public void setLocation(Warehouse location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

}
