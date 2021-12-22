package com.xworkz.string.operations;

import com.xworkz.string.dto.TransportDetails;

public class TransportTester {

	public static void main(String []args)
	{
	TransportOperation operation= new TransportOperation();
	TransportDetails dto = new TransportDetails("landtransport","car","swift",(short)22,(long)95000);
	operation.add(dto);
	operation.printAll();
	}

	
}
