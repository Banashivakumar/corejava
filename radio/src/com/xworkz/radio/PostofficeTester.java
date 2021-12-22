package com.xworkz.radio;

import com.xworkz.radio.dao.PostofficeDAO;
import com.xworkz.radio.dto.EmployeeDTO;
import com.xworkz.radio.dto.PostofficeDTO;

public class PostofficeTester {
	
	public static void main(String[] args) {
		PostofficeDTO detailsdto=new PostofficeDTO();
		detailsdto.setBranch("Tiptur");
		detailsdto.setArea("kr extension");
		detailsdto.setPincode((long)572201);
		
		
		EmployeeDTO dto=new EmployeeDTO();
		dto.setName("harsha");
		dto.setId((byte)7);
		dto.setSalary((long)1500000);
		
		detailsdto.setEmployee(dto);
		
		PostofficeDAO dao=new PostofficeDAO(); 
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(detailsdto);
		
		System.out.println(resp1);
		System.out.println(resp2);
		
		
         
         
         PostofficeDTO detailsDTO=dao.updateBranchByArea("rajajinagar", "kr extension");
 		System.out.println(detailsDTO.getAll());
 		
 		PostofficeDTO detailsDTO1=dao.updatePincodeByArea((long)572202, "kr extension");
 		System.out.println(detailsDTO1.getAll());
 		
 		PostofficeDTO detailsDTO2=dao.updateAreaByBranch("tumkur", "Tiptur");
 		System.out.println(detailsDTO2.getAll());
 		
 		dao.printAll();
 		boolean isdelete=dao.deleteByArea("kr extension");
 		System.out.println("data deleted"+isdelete);
 		dao.printAll();
 		
 		
 		
 		dao.printAll();
 		boolean isdelete1=dao.deleteByBranch("Tiptur");
 		System.out.println("data deleted"+isdelete1);
 		dao.printAll();
 		
 		dao.printAll();
 		boolean isdelete2=dao.deleteByPincode(572201);
 		System.out.println("data deleted"+isdelete2);
 		dao.printAll();
 		
 		

 		
 	}

}

