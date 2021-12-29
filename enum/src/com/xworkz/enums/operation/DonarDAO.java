package com.xworkz.enums.operation;

import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.Gender;

public class DonarDAO {
	DonerDTO[] donars = new DonerDTO[3];
	int index = 0;
	
	public void save (DonerDTO name) {
		if(index<donars.length) {
			donars[index]= name;
			index++;
			
		}
	}
	
	public String getAll(DonerDTO[]dto) {
		if(donars.length==dto.length) {
			donars =dto;
			return "get the value";
		}
		return "not get the value";
	}

	public String insert(DonerDTO doner) {
		if (index < donars.length) {
			donars[index] = doner;
			index++;
			return "inserted";
		}
		return "not inserted";
	}
	
	

	public String insertAll(DonerDTO[] doner1) {
		if (doner1.length == donars.length) {
			donars = doner1;
			return "array inserted";
		}
		return "array not inserted";
	}

	public DonerDTO updateContactByName(String name,long contact) {
	  for (int i = 0; i < donars.length; i++) {
		  if(name.equals(donars[i].getName())){
			 donars[i].getDetails().setPhonenumber(contact);
			 return donars[index];
		  }
		
	}
	  return null;
  }
	public DonerDTO[] getByBloodGroup(BloodGroup bloodgroup) {
	 int j = 0;
	 DonerDTO[] doners1= new DonerDTO[donars.length];
	 for (int i = 0; i < doners1.length; i++) {
		 if(donars[i]!= null && bloodgroup.equals(donars[i].getBloodgroup())) {
			 doners1[j]= donars[i];
			 j++;
		 }	
	}
	 return doners1;
	}
	
	public DonerDTO[] getByGender(Gender gender) {
		int j=0;
		DonerDTO[] doners2= new DonerDTO[donars.length];
		for (int i = 0; i < doners2.length; i++) {
			if(donars[i]!=null && gender.equals(donars[i].getGender())) {
				doners2[j]=donars[i];
				j++;
			}
		}
		return doners2;
	}
	
	
	
	
	public void printAll() {
		
		for (int i = 0;i < donars.length; i++) {
			System.out.println(donars[i]);
		}
	}
}
