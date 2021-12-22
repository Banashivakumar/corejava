package com.xworkz.string.operations;

import com.xworkz.string.dto.HillstationDetails;

public class HillstationOperation {

	
	HillstationDetails[] dtos=new HillstationDetails[5];
	int index=0;
	
	public void add(HillstationDetails dto)
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
