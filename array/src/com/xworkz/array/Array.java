package com.xworkz.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
public static void main(String[] args) {
		
		int num[] = {3,20,56,98,57,6,15,5};
		 
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("sort method");
		 Arrays.sort(num);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("filling the array");
		 Arrays.fill(num, 56);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		System.out.println();
		 System.out.println("using math operator");
		 double[] doub =new double[5];
//		 for (dint i = 0; i < doub.length; i++) {
//			 Doubt[i]=Math.random()*50;
//			 System.out.print(Math.round(Doubt[i]) +"\t");
//			 
			 Scanner scanner= new Scanner(System.in);
			 for (int j = 0; j < doub.length; j++) {
				 doub[j]=scanner.nextDouble();
                System.out.println(doub[j]);
				
			}
			
		}

}
