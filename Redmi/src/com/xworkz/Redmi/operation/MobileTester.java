package com.xworkz.Redmi.operation;
import com.xworkz.Redmi.dto.MobileDTO;



public class MobileTester {
	public static void main(String[] args) {
		MobileOperation operation=new MobileOperation();
		MobileDTO redmi=new MobileDTO(32000,"black","sa870",(byte)4,(byte)48);
		operation.save(redmi);
		
	}
	


}

