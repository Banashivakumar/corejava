package com.xworkz.inheritance1;

import com.xworkz.inheritance1.dto.Metro;
import com.xworkz.inheritance1.dto.Train;

public class Tester {

	public static void main(String []args) {
		
		Metro metro = new Metro();
			System.out.println(metro.color("black"));
			System.out.println(metro.station("yeshvanthpur"));
			System.out.println(metro.trains(3));
			System.out.println(metro.workers(30));
			System.out.println(metro.lift(true));
			
			Train train = new Train();
			
			System.out.println(train.color("black"));
			System.out.println(train.speed(78.50f));
			System.out.println(train.passengers((short)100));
			System.out.println(train.length((byte)(60)));
			System.out.println(train.route("jpnagar"));
			
			
			
			
		}
	
}
