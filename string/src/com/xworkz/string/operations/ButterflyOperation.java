package com.xworkz.string.operations;

import com.xworkz.string.dto.ButterflyDetails;


public class ButterflyOperation {
	
	ButterflyDetails[] dtos=new ButterflyDetails[5];
	int index=0;
	
	public void add(ButterflyDetails dto)
	{
		dtos[0]= dto;
		index++;
	}
	
	public void printAll()
	{
		for(int index=0; index<dtos.length;index++) {
			System.out.println(dtos[index].getAll());
		}
	}

}



