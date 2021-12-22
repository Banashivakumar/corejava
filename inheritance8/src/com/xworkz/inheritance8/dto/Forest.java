package com.xworkz.inheritance8.dto;

public class Forest {
	
	public String country;
	public int animals;
	public String name;
	public int trees;
	public boolean cloudy;
	
	public Forest() {
		System.out.println("Invoking Forest class");
	}
	
	public String country(String country) {
		this.country=country;
		return country;
	}
	
	public int animals(int animals) {
		this.animals=animals;
		return animals;
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public boolean cloudy(boolean cloudy) {
		this.cloudy=cloudy;
		return cloudy;
	}
	
	public int trees(int trees) {
		this.trees=trees;
		return trees;
	}

}
