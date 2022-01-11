package com.xworkz.exceptionhandling;

public class Arithmetic {
	
public static void main(String[] args) {
		
		int num=100 ,div;
		try {
		div=num/0;
		
		System.out.println(div);
		}
		catch (ArithmeticException exception) {
			System.out.println(exception.getMessage());
			
		}
		
	}

}
