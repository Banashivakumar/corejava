package com.xworkz.radio.dao;

import com.xworkz.radio.dto.PostofficeDTO;


public class PostofficeDAO {
	
	PostofficeDTO[] dtos=new PostofficeDTO[5];
	int index=0;
	
	public String insert(PostofficeDTO dto) {
		if(dto==null) {
			return "this object is null";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getBranch());
			index++;
			return "object added with the branch name"+dtos[index-1].getBranch();
		}
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	
public PostofficeDTO updateBranchByArea(String branch,String area){
	PostofficeDTO dto=null;
	for(int index=0;index<dtos.length;index++) {
		
		if(dtos[index]!=null) {
		if (dtos[index].getArea().equals(area)){
			dtos[index].setBranch(branch);
			dto=dtos[index];
			
		}
	}
	
}
	return dto;

}


public PostofficeDTO	updatePincodeByArea(long pincode,String area){
	PostofficeDTO dto=null;
	for(int index=0;index<dtos.length;index++) {
		
		if(dtos[index]!=null) {
		if (dtos[index].getArea().equals(area)){
			dtos[index].setPincode(pincode);
			dto=dtos[index];
			
		}
	}
	
}
	return dto;

}

public PostofficeDTO updateAreaByBranch(String area,String branch){
	PostofficeDTO dto=null;
	for(int index=0;index<dtos.length;index++) {
		
		if(dtos[index]!=null) {
		if (dtos[index].getBranch().equals(branch)){
			dtos[index].setArea(area);
			dto=dtos[index];
			
		}
	}
	
}
	return dto;

}


public boolean deleteByArea(String area) {
	for(int index=0;index<dtos.length;index++) {
		if(dtos[index]!=null) {
		if (area==dtos[index].getArea()) {
			dtos[index]=null;
			return true;
		}
	}
	}
	return false;
}

	

public boolean deleteByBranch(String branch) {
	for(int index=0;index<dtos.length;index++) {
		if(dtos[index]!=null) {
		if (branch==dtos[index].getBranch()) {
			dtos[index]=null;
			return true;
		}
	}
	}
	return false;
}


public boolean deleteByPincode(int pincode) {
	for(int index=0;index<dtos.length;index++) {
		if (pincode==dtos[index].getPincode()) {
			dtos[index]=null;
			return true;
		}
	}

	return false;
}


	
	public PostofficeDTO getByPincode(long pincode) {
		for(int index=0; index<dtos.length;index++) {
			if(pincode==dtos[index].getPincode()) {
				return dtos[index];
			}
		}
		return null;
	}
	public PostofficeDTO getByName(String name) {
		for(int index=0;index<dtos.length;index++) {
			if(name==dtos[index].getEmployee().getName()) {
				return dtos[index];
			}
		
	}
		return null;
	}
	
	public PostofficeDTO getByArea(String area) {
		for(int index=0;index<dtos.length;index++) {
			if(area==dtos[index].getArea()) {
				return dtos[index];
			}
		}
		return null;
	}
	
	
	
}

