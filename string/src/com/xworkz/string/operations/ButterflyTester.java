package com.xworkz.string.operations;

import com.xworkz.string.dto.ButterflyDetails;


public class ButterflyTester {
	
	public static void main(String []args)
	{
	ButterflyOperation operation= new ButterflyOperation();
	ButterflyDetails dto = new ButterflyDetails((int)3,"annabella",(short)7,"brown");
	operation.add(dto);
	operation.printAll();
	}

}



