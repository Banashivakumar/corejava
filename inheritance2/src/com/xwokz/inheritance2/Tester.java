package com.xwokz.inheritance2;

import com.xwokz.inheritance2.dto.Airlines;
import com.xwokz.inheritance2.dto.Kingfisher;

public class Tester {
	
	public static void main(String []args) {
		
		Kingfisher indigo = new Kingfisher();
				System.out.println(indigo.country("india"));
				System.out.println(indigo.passengers(2000));
				System.out.println(indigo.color("red and white"));
				System.out.println(indigo.destination(75));
				System.out.println(indigo.lowcost(true));
				
				Airlines airlines = new Airlines();
				
				System.out.println(airlines.place("india"));
				System.out.println(airlines.ratings(8));
				System.out.println(airlines.manager("shetty"));
				System.out.println(airlines.workers(250));
				System.out.println(airlines.safety(true));
				
				
				
				
			}

}
