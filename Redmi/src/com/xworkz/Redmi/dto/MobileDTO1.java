package com.xworkz.Redmi.dto;

public class MobileDTO1 {
	private int price;
	private String color;
	private String series;
	private byte noofcamera;
	private byte ram;
	private String modelnumber;
	private byte cellulartechnology;
	private String os;
	private int storage;
	
	public MobileDTO1() {
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
public void setSeries(String series) {
	this.series=series;	
}
public String getSeries() {
	return series;
}
public void setNoofcamera(byte noofcamera) {
	this.noofcamera=noofcamera;	
}
public byte getNoofcamera() {
	return noofcamera;
}
public void setRam(byte ram) {
	this.ram=ram;	
}
public byte getRam() {
	return ram;
}
public void setModelnumber(String modelnumber) {
	this.modelnumber=modelnumber;	
}
public String getModelnumber() {
	return modelnumber;
}
public void setCellulartechnology(byte cellulartechnology) {
	this.cellulartechnology=cellulartechnology;	
}
public byte getCellulartechnology() {
	return cellulartechnology;
}
public void setOs(String os) {
	this.os=os;	
}
public String getOs() {
	return os;
}
public void setStorage(int storage) {
	this.storage=storage;	
}
public int getStorage() {
	return storage;
}
}