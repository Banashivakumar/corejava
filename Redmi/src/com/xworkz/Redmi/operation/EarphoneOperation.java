package com.xworkz.Redmi.operation;
import com.xworkz.Redmi.dto.EarphoneDTO;

public class EarphoneOperation {

	EarphoneDTO[] dtos=new EarphoneDTO[7];
	
	public void save(EarphoneDTO dto) {
		
		dtos[0]=dto;
		dto.printAll();
	}
}