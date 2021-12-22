package com.xworkz.Redmi;

import com.xworkz.Redmi.dto.EarphoneDTO1;
import com.xworkz.Redmi.operation.Earphone1Operation;

public class Earphone1Tester {

	
	public static void main(String[] args) {
		Earphone1Operation operation=new Earphone1Operation();
		EarphoneDTO1 redmi=new EarphoneDTO1();
		redmi.setPrice(5000);
		redmi.setColor("black");
		redmi.setBrand("midualdriver");
		redmi.setConnectortype("wired");
		redmi.setHeadphonejack((float)3.5f);
		redmi.setFrequencyresponse((long)2000);
		
		operation.save(redmi);
}
}
