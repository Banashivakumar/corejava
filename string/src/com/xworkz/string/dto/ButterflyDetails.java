package com.xworkz.string.dto;

public class ButterflyDetails {

	int numberofbutterfly;
	String name;
	short lifespan;
	String color;
	
	public ButterflyDetails(int numberofbutterfly,String name,short lifespan,String color) {
		this.numberofbutterfly= numberofbutterfly;
		this.name= name;
		this.lifespan= lifespan;
		this.color=color;
	}
  public String getAll() 
  {
	return numberofbutterfly +"\t" + name +"\t" + lifespan +"\t" + color;
}



}


