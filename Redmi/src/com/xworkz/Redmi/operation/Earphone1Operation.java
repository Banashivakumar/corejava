package com.xworkz.Redmi.operation;

import com.xworkz.Redmi.dto.EarphoneDTO1;

public class Earphone1Operation {
	
EarphoneDTO1[] dtos=new EarphoneDTO1[10];
	
	public void save(EarphoneDTO1 dto) {
		dtos[0]=dto;
		System.out.println(dto.getPrice());
		System.out.println(dto.getColor());
		System.out.println(dto.getBrand());
		System.out.println(dto.getConnectortype());
		System.out.println(dto.getHeadphonejack());
		System.out.println(dto.getFrequencyresponse());

}
}
