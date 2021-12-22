package com.xworkz.string.dto;

public class TransportDetails {
	
	String transportname ;
	String vehicalname;
	String company;
	short speed;
	long price;
	
	public TransportDetails(String transportname,String vehicalname,String company,short speed,long price) {
		this.transportname= transportname;
		this.vehicalname= vehicalname;
		this.company= company;
		this.speed= speed;
		this.price= price;
	}
  public String getAll() 
  {
	return transportname +"\t" + vehicalname +"\t" + company +"\t" + speed +"\t"+ price;
}

}
