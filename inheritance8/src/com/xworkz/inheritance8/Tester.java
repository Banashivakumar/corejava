package com.xworkz.inheritance8;

import com.xworkz.inheritance8.dto.Forest;
import com.xworkz.inheritance8.dto.Nagarahole;

public class Tester {

	public static void main(String []args) {
		
		Nagarahole nagarahole = new Nagarahole();
			System.out.println(nagarahole.type("forest"));
			System.out.println(nagarahole.animals(250));
			System.out.println(nagarahole.place("nagarahole"));
			System.out.println(nagarahole.birds(1200));
			System.out.println(nagarahole.goodmaintenance(true));
			
			Forest forest = new Forest();
			
			System.out.println(forest.country("india"));
			System.out.println(forest.animals(20000));
			System.out.println(forest.name("amazon"));
			System.out.println(forest.trees(31300));
			System.out.println(forest.cloudy(true));
			
			
			
			
		}
	
}
