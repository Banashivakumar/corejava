package com.xworkz.Redmi.operation;

import com.xworkz.Redmi.dto.MobileDTO1;

public class Mobile1Operation {

MobileDTO1[] dtos=new MobileDTO1[10];
int index=0;
public void add(MobileDTO1 dto) {
	System.out.println("adding data");
	dtos[index]=dto;
	index++;
	System.out.println("saved data");
}

	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
		
			System.out.println(dtos[index].
		getPrice()+"\t" +
		dtos[index].getColor()+"\t"+
		dtos[index].getSeries()+"\t"+
	    dtos[index].getNoofcamera()+"\t"+
		dtos[index].getRam()+"\t"+
		dtos[index].getModelnumber()+"\t"+
		dtos[index].getCellulartechnology()+"\t"+
		dtos[index].getOs()+"\t"+
		dtos[index].getStorage());
		
	}
}


		
	}
}

