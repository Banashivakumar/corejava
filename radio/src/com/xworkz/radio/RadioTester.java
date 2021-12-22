package com.xworkz.radio;

import com.xworkz.radio.dao.RadioDAO;
import com.xworkz.radio.dto.RadioDetailsDTO;
import com.xworkz.radio.dto.SizeDTO;

public class RadioTester {
	
	public static void main(String[] args) {
		RadioDetailsDTO detailsdto=new RadioDetailsDTO();
		detailsdto.setCompany("ajantha");
		detailsdto.setPrice(500);
		detailsdto.setColor("blue");
		detailsdto.setNoofstations((byte)41);
		
		
		SizeDTO dto=new SizeDTO();
		dto.setHeight((float)24.28);
		dto.setLength(42.56);
		dto.setWidth(22.56);
		detailsdto.setSize(dto);
		
		RadioDAO dao=new  RadioDAO();
		String resp1=dao.insert(detailsdto);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailsdto);
		
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
         		
		RadioDetailsDTO detailsDTO=dao.updatePriceByColor(750, "blue");
		System.out.println(detailsDTO.getAll());
		
		RadioDetailsDTO detailsDTO1=dao.updateCompanyByColor("Bajaj", "blue");
		System.out.println(detailsDTO1.getAll());
		
		RadioDetailsDTO detailsDTO2=dao.updateNoofstationsByColor((byte)15, "blue");
		System.out.println(detailsDTO2.getAll());
		
		dao.printAll();
		boolean isdelete=dao.deleteByPrice(500);
		System.out.println("data deleted"+isdelete);
		dao.printAll();
		
		
		
		dao.printAll();
		boolean isdelete1=dao.deleteByNoofstations((byte)15);
		System.out.println("data deleted"+isdelete1);
		dao.printAll();
		
		dao.printAll();
		boolean isdelete2=dao.deleteByCompany("Bajaj");
		System.out.println("data deleted"+isdelete2);
		dao.printAll();
		
		

		
	}

}
