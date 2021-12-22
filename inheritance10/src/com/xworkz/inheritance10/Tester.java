package com.xworkz.inheritance10;

import com.xworkz.inheritance10.dto.Developer;
import com.xworkz.inheritance10.dto.Employee;

public class Tester {
	
public static void main(String []args) {
	
	   Developer developer= new Developer((long)750000);
		
		Developer developer1 = new Developer();
		System.out.println(developer1.type("testing"));
		
		System.out.println(developer1.company("nttdata"));
		System.out.println(developer1.servicebond(3));
		System.out.println(developer1.future(true));
		
		Employee employee = new Employee();
		
		System.out.println(employee.name("bana"));
		System.out.println(employee.contact((long)(843177626)));
		System.out.println(employee.address("mysore"));
		System.out.println(employee.gender('f'));
		System.out.println(employee.goodjob(true));
		
		
		
		
	}

}
