package com.xworkz.Redmi.dto;

public class WatchDTO {
	
	int price;
	String watchcolor;
	String bandcolor;
	String brand;
	String connectortype;
	String device;
	String feature;
	float screensize;
	
	public WatchDTO() {
	}
	public WatchDTO(int price,String watchcolor,String bandcolor,String brand,String connectortype,String device,String feature,float screensize ) {
		this.price=price;
		this.watchcolor=watchcolor;
		this.bandcolor=bandcolor;
		this.brand=brand;
		this.connectortype=connectortype;
		this.device=device;
		this.feature=feature;
		this.screensize=screensize;
	}
	public void printAll() {
System.out.println(price +"\t" + watchcolor+"\t" +bandcolor+ "\t"+brand+"\t" +connectortype+"\t" +device +"\t" + feature+"\t"+screensize);
	}
 
		
	}


