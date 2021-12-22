package com.xworkz.Redmi.dto;

public class EarphoneDTO {
	int price;
	String color;
	String brand;
	String connectortype;
	float headphonejack;
	long frequencyresponse;
	
	public EarphoneDTO() {
	}
	public EarphoneDTO(int price,String color,String brand,String connectortype,float headphonejack,long frequencyresponse ) {
		this.price=price;
		this.color=color;
		this.brand=brand;
		this.connectortype=connectortype;
		this.headphonejack=headphonejack;
		this.frequencyresponse=frequencyresponse;
	}
	public void printAll() {
		System.out.println(price +"\t" + color+"\t" +brand+ "\t" +connectortype+"\t" +headphonejack +"\t" + frequencyresponse);
	}

}
