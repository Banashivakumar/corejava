package com.xworkz.Redmi;

import com.xworkz.Redmi.dto.WatchDTO;
import com.xworkz.Redmi.operation.WatchOperation;

public class WatchTester {
	
	 public static void main(String[] args) {
		WatchOperation operation=new WatchOperation();
		WatchDTO redmi=new WatchDTO((int)4000,"blackpro","black","fire-boltt","bluetooth","android","tracker",(float)1.69f);
		operation.save(redmi);
		
	}
	


}


