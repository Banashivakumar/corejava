package com.xworkz.inheritance7;

import com.xworkz.inheritance7.dto.Birds;
import com.xworkz.inheritance7.dto.Peacock;

public class Tester {
	
public static void main(String []args) {
		
		Birds birds = new Birds();
		System.out.println(birds.color("green"));
		System.out.println(birds.species("5.9f"));
		System.out.println(birds.flyingDistance(5.5f));
		System.out.println(birds.laysEgg(true));
		System.out.println(birds.swim(false));
		
		Peacock peacock = new Peacock();
		
		System.out.println(peacock.color("blue"));
		System.out.println(peacock.weight(4.8f));
		System.out.println(peacock.noOfFethers((short)2500));
		System.out.println(peacock.height((byte)(5)));
		System.out.println(peacock.count((byte)(25)));
		
		
		
		
	}

}
