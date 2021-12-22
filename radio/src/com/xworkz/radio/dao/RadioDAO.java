package com.xworkz.radio.dao;

import com.xworkz.radio.dto.RadioDetailsDTO;

public class RadioDAO {
	RadioDetailsDTO[] dtos=new RadioDetailsDTO[5];
	int index=0;
	
	public String insert(RadioDetailsDTO dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getCompany());
			index++;
			return "object added with the company name"+dtos[index-1].getCompany();
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	
	
	
	public RadioDetailsDTO	updatePriceByColor(int price,String color){
		RadioDetailsDTO dto=null;
		for(int index=0;index<dtos.length;index++) {
			
			if(dtos[index]!=null) {
			if (dtos[index].getColor().equals(color)){
				dtos[index].setPrice(price);
				dto=dtos[index];
				
			}
		}
		
	}
		return dto;

	}
	
public RadioDetailsDTO	updateCompanyByColor(String company,String color){
	RadioDetailsDTO dto=null;
	for(int index=0;index<dtos.length;index++) {
		
		if(dtos[index]!=null) {
		if (dtos[index].getColor().equals(color)){
			dtos[index].setCompany(company);
			dto=dtos[index];
			
		}
	}
	
}
	return dto;

}


public RadioDetailsDTO	updateNoofstationsByColor(byte noofstations,String color){
	RadioDetailsDTO dto=null;
	for(int index=0;index<dtos.length;index++) {
		
		if(dtos[index]!=null) {
		if (dtos[index].getColor().equals(color)){
			dtos[index].setNoofstations(noofstations);
			dto=dtos[index];
			
		}
	}
	
}
	return dto;

}

public boolean deleteByPrice(int price) {
	for(int index=0;index<dtos.length;index++) {
		if(dtos[index]!=null) {
		if (price==dtos[index].getPrice()) {
			dtos[index]=null;
			return true;
		}
	}
	}
	return false;
}

	

public boolean deleteByCompany(String company) {
	for(int index=0;index<dtos.length;index++) {
		if(dtos[index]!=null) {
		if (company==dtos[index].getCompany()) {
			dtos[index]=null;
			return true;
		}
	}
	}
	return false;
}

public boolean deleteByNoofstations(byte noofstations) {
	for(int index=0;index<dtos.length;index++) {
		if(dtos[index]!=null) {
		if (noofstations==dtos[index].getNoofstations()) {
			dtos[index]=null;
			return true;
		}
	}
	}
	return false;
}



	
	
	public RadioDetailsDTO getByPrice(int price) {
		for(int index=0; index<dtos.length;index++) {
			if(price==dtos[index].getPrice()) {
				return dtos[index];
			}
		}
		return null;
	}
	public RadioDetailsDTO getByWidth(double width) {
		for(int index=0;index<dtos.length;index++) {
			if(width==dtos[index].getSize().getWidth()) {
				return dtos[index];
			}
		}
		return null;
	}
	
	public RadioDetailsDTO getByColor(String color) {
		for(int index=0;index<dtos.length;index++) {
			if(color==dtos[index].getColor()) {
				return dtos[index];
			}
		}
		return null;
	}
	
	
	
}
