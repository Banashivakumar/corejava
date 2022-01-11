package com.xworkz.exceptionhandling;

public class ArrayObjective {
	
	static int num[] = {8,4,3,1,7,7,6,2,6,3};
	public static void main(String[] args) {
		
		
		for (int i = 0; i <= num.length; i++) {
			try {
			System.out.println(num[i]);
			}
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println(exception.getMessage());
			}
		}
		
	}


}
