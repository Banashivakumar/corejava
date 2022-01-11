package com.xworkz.exceptionhandling;

public class ClassCast {
	
public static void main(String[] args) {
		
		Object obj = new Object();
		try {
		String str = (String)obj;
		System.out.println(str);
		}
		catch (ClassCastException exception) {
			System.out.println(exception.getMessage());
		}
		
		
	}

}
