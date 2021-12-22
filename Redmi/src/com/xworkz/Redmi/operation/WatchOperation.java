package com.xworkz.Redmi.operation;

import com.xworkz.Redmi.dto.WatchDTO;

public class WatchOperation {
	
	WatchDTO[] dtos=new WatchDTO[10];
	
	public void save(WatchDTO dto) {
		
		dtos[0]=dto;
		dto.printAll();
	}


}
