package com.xworkz.inheritance6;

import com.xworkz.inheritance6.dto.Banana;
import com.xworkz.inheritance6.dto.Fruit;

public class Tester {
	
public static void main(String []args) {
		
		Banana banana = new Banana();
		System.out.println(banana.type("fruits"));
		System.out.println(banana.height(45.76f));
		System.out.println(banana.color("yellow"));
		System.out.println(banana.width((byte)(25)));
		System.out.println(banana.healthy(true));
		
		Fruit fruits = new Fruit();
		
		System.out.println(fruits.color("red"));
		System.out.println(fruits.tasty(true));
		System.out.println(fruits.price(120));
		System.out.println(fruits.types(25));
		System.out.println(fruits.name("apple"));
		
		
		
		
	}

}
