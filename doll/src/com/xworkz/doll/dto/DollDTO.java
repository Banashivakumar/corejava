package com.xworkz.doll.dto;

public class DollDTO {
	String Type;
	short price;
	String color;
	byte size;
	String brand;
	
	public void designDoll() {
		System.out.println("regular doll");
	}
   public void designDoll(String color) {
	System.out.println("regular doll with color"+color);
}
   public void designDoll(byte size) {
	   System.out.println("regular doll with size"+size);
   }
   public void designDoll(byte size,String color) {
	   System.out.println("regular doll size and color"+"\t"+size +"\t"+color);
   }
   public void designDoll(String color,byte size) {
	 
   System.out.println("regular doll color and size" +"\t"+color +"\t"+size);
} 
}
