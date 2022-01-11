package com.xworkz.exceptionhandling;

public class TryCatch {
	
	 static String[] arry =  new String[]{"bana","hema",null,"srushti","kavya"};
		
		public static void main(String[] args) {
			
			System.out.println(arry[0].toUpperCase());
			System.out.println(arry[1].toUpperCase());
			try {
			System.out.println(arry[2].toUpperCase());
			}
			catch (NullPointerException exception) {
				System.out.println(exception);
			}
			System.out.println(arry[3].toUpperCase());
			System.out.println(arry[4].toUpperCase());
			
		}

}
