package com.xworkz.exceptionhandling;

public class Book {
	
	public Book() {
		System.out.println("reading books to gain knowledge");
		{
			System.out.println("instance block inside the constructor ");
		}
	
	}
	
	static {
		System.out.println("envoking the static block");
		
	
		{
			System.out.println("instance block inside static");
		}
	}
	
	{
		//static {
			
		//}
		System.out.println("envoking the instance block");
	}
	{
		System.out.println("inside instance");
	}

}
