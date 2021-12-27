package com.xworkz.hasarelation.dao;

import com.xworkz.hasarelation.dto.TrainieeDetails;

public class TrainieeOperation {
	
	TrainieeDetails[] details = new TrainieeDetails[4];
	int index=0;
	
	public void save(TrainieeDetails names) {
		 if(index<details.length) {
			 details[index]=names;
			 index++;
		 }
	}
	
	public void printAll() {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			System.out.println(details[index].toString());
			}
		}
	}
	
	public TrainieeDetails updateCountryByName(String name ,String country) {
		
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(name.equals(details[index].getName())) {
		details[index].getAdress().getArea().getDistrict().getTaluk().getState().setCountry(country);
		return details[index];
			}
		}
	}
		return details[index];
	}

	public TrainieeDetails getByCountry(String country) {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(country.equals(details[index].getAdress().getArea().getDistrict().getTaluk().getState().getCountry())) {
				return details[index];
			}
		}
			}
		return null;
	}
	  
	public TrainieeDetails getByDistrict(String name) {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			if(name.equals(details[index].getAdress().getArea().getDistrict().getName())) {
				return details[index];
			}
			}	
		}
		  
		  return details[index];
	  }
}
