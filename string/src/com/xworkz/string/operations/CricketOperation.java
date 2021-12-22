package com.xworkz.string.operations;

import com.xworkz.string.dto.CricketDetails;


public class CricketOperation {
	
	
	CricketDetails[] dtos=new CricketDetails[5];
	int index=0;
	
	public void add(CricketDetails dto)
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
