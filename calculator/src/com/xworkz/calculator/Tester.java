package com.xworkz.calculator;

import java.util.Scanner;

public class Tester {
	
public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//        long a,b,c,selection;
//		System.out.println("please enter two digits");
//		a=scanner.nextLong();
//		b=scanner.nextLong();
//		
//		System.out.println("choose an option");
//		System.out.println("press 1 for addition");
//		System.out.println("press 2 for subtraction");
//		System.out.println("press 3 for multiplication");
//		System.out.println("press 4 for division");
//			
//		selection=scanner.nextLong();
//		while(selection>4) {
//			System.out.println("enter the valid option");
//			selection=scanner.nextInt();
//		}
//		Calculator calci = new Calculator();
//		if(selection==1) {
//			 c=calci.add(a, b);
//			System.out.println("ans:" +c );
//		}
//		else if(selection==2) {
//	      c=calci.sub(a, b);
//			System.out.println("ans:" +c);
//		}
//		else if(selection==3) {
//			calci.multiplication(a, b);
//		}
//		else if(selection==4) {
//			calci.division(a, b);
//		}
//		
	Scanner scanner1 = new Scanner(System.in);
	double x,y,z,select;
	System.out.println("please enter two digits");
	x=scanner1.nextDouble();
	y=scanner1.nextDouble();
	
	System.out.println("choose an option");
	System.out.println("press 1 for addition");
	System.out.println("press 2 for subtraction");
	System.out.println("press 3 for multiplication");
	System.out.println("press 4 for division");
	
	select=scanner1.nextDouble();
	while(select>4) {
		System.out.println("option invalid");
		select=scanner1.nextDouble();
	}
	Calculator calculator = new Calculator();
	if(select ==1) {
		z=calculator.add(x, y);
		System.out.println("ans :" +z);
	}else if(select ==2) {
		z=calculator.sub(x, y);
		System.out.println("ans :" +z);
	}else if(select==3) {
		calculator.multiplication(x, y);
	}else if(select==4) {
		calculator.division(x, y);
	}
	
	}
	

}
