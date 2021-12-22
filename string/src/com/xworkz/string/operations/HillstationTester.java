package com.xworkz.string.operations;

import com.xworkz.string.dto.HillstationDetails;


public class HillstationTester {

	public static void main(String []args)
	{
	HillstationOperation operation= new HillstationOperation();
	HillstationDetails dto = new HillstationDetails((long)5000,"nandihills",(short)32,"banglore");
	operation.add(dto);
	operation.printAll();
	}

	
}
