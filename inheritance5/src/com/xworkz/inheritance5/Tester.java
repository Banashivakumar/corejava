package com.xworkz.inheritance5;

import com.xworkz.inheritance5.dto.Flower;
import com.xworkz.inheritance5.dto.Lotus;

public class Tester {
	
public static void main(String []args) {
		
		Lotus lotus = new Lotus();
		System.out.println(lotus.type("flower"));
		System.out.println(lotus.petals(15));
		System.out.println(lotus.color("darkpink"));
		System.out.println(lotus.price(25));
		System.out.println(lotus.beautiful(true));
		
		Flower flower = new Flower();
		
		System.out.println(flower.name("lilly"));
		System.out.println(flower.types(35));
		System.out.println(flower.height((byte)15));
		System.out.println(flower.width(35));
		System.out.println(flower.goodsmell(true));
		
		
		
		
	}

}
