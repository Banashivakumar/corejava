package com.xworkz.gun.dao;

import com.xworkz.gun.dto.Gundeatilsdto;
import com.xworkz.gun.dto.Types;

public class Gunoperation {
	
	Gundeatilsdto[] operation = new Gundeatilsdto[4];
	int index=0;
	
	public String save(Gundeatilsdto names) {
	if(index<operation.length) {
		operation[index]=names;
		index++;
	  return "value inserted";
	}
	return "value not inserted";
	}
	
	public void printAll() {
		for (int index = 0; index < operation.length; index++) {
			System.out.println(operation[index]);
			
		}
	}
	
	public Gundeatilsdto[] getAllByTypes(Types type) {
		Gundeatilsdto[] detail = new Gundeatilsdto[operation.length];
		int j=0;
		for (int index = 0; index < operation.length; index++) {
			if(operation[index]!=null) {
			if(type.equals(operation[index].getTypes())) {
				detail[j]= operation[index];
				j++;
			}
			}
			
		}
		return detail;
	}
	
	public Gundeatilsdto[] getByBarrelmaterial(String barrelMaterial) {
		Gundeatilsdto[] detail1 = new Gundeatilsdto[operation.length];
		int k=0;
		for (int index = 0; index < operation.length; index++) {
			if(operation[index]!=null) {
			if(barrelMaterial.equals(operation[index].getBarrelMaterial())) {
				detail1[k]=operation[index];
				k++;
			}
			}
			
		}
		return detail1;
	}
	
	public Gundeatilsdto updateComponentByGunName(String component,String gunName) {
		for (int index = 0; index < operation.length; index++) {
			if(gunName.equals(operation[index].getGunName())) {
				operation[index].getBullet().setComponent(component);
				return operation[index];
			}
			
		}
		return null;
	}
	
	public Gundeatilsdto updateLocationByGunName(String gunName,String location) {
		for (int index = 0; index < operation.length; index++) {
			if(gunName.equals(operation[index].getGunName())) {
				operation[index].getCompany().setLocation(location);
				return operation[index];
			}
			
		}
		return null;
	}
	public Gundeatilsdto[] getAllByScope(byte scope) {
		Gundeatilsdto[] scop = new Gundeatilsdto[operation.length];
		int s=0;
		for (int index = 0; index < scop.length; index++) {
			if(scope == (operation[index].getScope())) {
				operation[index].setScope(scope);
				scop[s]= operation[index];
				s++;
			}
			
		}
		return scop;
		
	}
	public Gundeatilsdto deleteByName(String gunName) {
		for (int index = 0; index < operation.length; index++) {
			if(operation[index]!=null) {
			if(gunName.equals(operation[index].getGunName())) {
				operation[index]=null;
			}
			}
			
		}
		return null;

}
}