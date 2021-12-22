package com.xworkz.string.operations;

import com.xworkz.string.dto.TransportDetails;

public class TransportOperation {
	
	TransportDetails[] dtos=new TransportDetails[5];
	int index=0;
	
	public void add(TransportDetails dto)
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
