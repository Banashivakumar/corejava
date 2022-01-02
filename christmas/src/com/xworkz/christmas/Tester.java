package com.xworkz.christmas;

public class Tester {
	
	public static void main(String[] args) {
		Christmas christmas1 = new Christmas(25.13f, (byte)1);
	    System.out.println(christmas1.toString());
	    
	    System.out.println();
	    
		Christmas christmas2 = new Christmas(25.19f,(byte)1);
		System.out.println("date"+christmas2.hashCode());
		System.out.println("noOfDays"+christmas2.hashCode());

		System.out.println();
		
		System.out.println(christmas1.equals(christmas2));
				
	}

}
