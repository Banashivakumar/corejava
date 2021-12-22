package com.xworkz.string.operations;

import com.xworkz.string.dto.CricketDetails;
public class CricketTester {
	
	public static void main(String []args)
	{
	CricketOperation operation= new CricketOperation();
	CricketDetails dto = new CricketDetails((int)7,"India",(short)11,"Dhoni");
	operation.add(dto);
	operation.printAll();
	}

}
