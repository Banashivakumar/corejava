package com.xworkz.string.operations;

import com.xworkz.string.dto.TempleDetails;

public class TempleTester {

	public static void main(String []args)
	{
	TempleOperation operation= new TempleOperation();
	TempleDetails dto = new TempleDetails((int)5,"ganeshtemple","ganesha","tiptur");
	operation.add(dto);
	operation.printAll();
	
	TempleDetails responseDTO=operation.updateNumberoftemplesByPlace("tiptur",3);
	System.out.print(responseDTO.getAll());
	}

	
}
