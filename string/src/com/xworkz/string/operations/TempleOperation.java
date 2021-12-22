package com.xworkz.string.operations;

import com.xworkz.string.dto.TempleDetails;

public class TempleOperation {
	
	TempleDetails[] dtos=new TempleDetails[4];
	int index=0;
	
	public void add(TempleDetails dto)
	{
		dtos[0]= dto;
		index++;
	}
	
	public void printAll()
	{
		for(int index=0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
			System.out.println(dtos[index].getAll());
		
	}
		}
	}
		
		public TempleDetails updateNumberoftemplesByPlace(String place, int numberoftemples) {
			TempleDetails templedetails=null;
			for(int index=0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					if(place.equals(dtos[index].place)) {
						dtos[index].numberoftemples=numberoftemples;
						templedetails =dtos[index];
					}
				}
			}
			return templedetails;
		}

	}

