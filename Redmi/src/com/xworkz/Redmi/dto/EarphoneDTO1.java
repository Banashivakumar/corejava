package com.xworkz.Redmi.dto;

public class EarphoneDTO1 {
	int price;
	String color;
	String brand;
	String connectortype;
	float headphonejack;
	long frequencyresponse;
	
	public EarphoneDTO1() {
	}
	public void setPrice(int price) {
		this.price=price;	
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;	
	}
	public String getColor() {
		return color;
	}
	public void setBrand(String brand) {
		this.brand=brand;	
	}
	public String getBrand() {
		return brand;
	}
	public void setConnectortype(String connectortype) {
		this.connectortype=connectortype;	
	}
	public String getConnectortype() {
		return connectortype;
	}
	public void setHeadphonejack(float headphonejack) {
		this.headphonejack=headphonejack;	
	}
	public float getHeadphonejack() {
		return headphonejack;
	}
	public void setFrequencyresponse(long frequencyresponse) {
		this.frequencyresponse=frequencyresponse;	
	}
	public long getFrequencyresponse() {
		return frequencyresponse;
	}
}
