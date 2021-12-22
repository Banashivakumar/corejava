package com.xworkz.Redmi;

import com.xworkz.Redmi.dto.MobileDTO1;
import com.xworkz.Redmi.operation.Mobile1Operation;

public class Mobile1Tester {

	public static void main(String[] args) {
		Mobile1Operation operation=new Mobile1Operation();
		MobileDTO1 redmi=new MobileDTO1();
		redmi.setPrice(15000);
		redmi.setColor("black");
		redmi.setSeries("promax");
		redmi.setCellulartechnology((byte)4);
		redmi.setModelnumber("10promax");
		redmi.setNoofcamera((byte)5);
		redmi.setOs("android");
		redmi.setStorage((int)128);
		redmi.setRam((byte)8);
		operation.add(redmi);
		operation.printAll();
		
	}
	
}
