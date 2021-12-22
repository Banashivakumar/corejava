package com.xworkz.Redmi.dto;


public class MobileDTO {
	public int price;
	public String color;
	public String series;
	public byte noofcamera;
	public byte ram;
	
	public MobileDTO() {
	}
	public MobileDTO(int price,String color,String series,byte noofcamera,byte ram) {
		this.price=price;
		this.color=color;
		this.series=series;
		this.noofcamera=noofcamera;
		this.ram=ram;
	}
	public void printAll() {
		System.out.println(price +"\t" + color+"\t" +series+ "\t" +noofcamera+"\t" +ram);
		
		
	}

}
