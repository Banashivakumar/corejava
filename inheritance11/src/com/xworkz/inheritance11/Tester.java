package com.xworkz.inheritance11;

import com.xworkz.inheritance11.dto.Institute;
import com.xworkz.inheritance11.dto.Xworkz;

public class Tester {
	
	public static void main(String []args) {
		Institute institute1= new Institute((int)5);
		
		Institute institute = new Institute();
			System.out.println(institute.name("xworkz"));
			
			System.out.println(institute.hr("akshara"));
			System.out.println(institute.placements(1000));
			System.out.println(institute.goodquality(true));
			
			Xworkz xworkz = new Xworkz();
			
			System.out.println(xworkz.course("java"));
			System.out.println(xworkz.batch(20));
			System.out.println(xworkz.founder("omkar"));
			System.out.println(xworkz.workers(5));
			System.out.println(xworkz.fees((long)(25000)));
			
			
			
			
		}

}
