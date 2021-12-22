package com.xworkz.Redmi;
import com.xworkz.Redmi.dto.EarphoneDTO;
import com.xworkz.Redmi.operation.EarphoneOperation;

public class EarphoneTester {
	
	public static void main(String[] args) {
		EarphoneOperation operation=new EarphoneOperation();
		EarphoneDTO redmi=new EarphoneDTO(1200,"black","xiamoi","wired",(float)3.5f,20000);
		operation.save(redmi);
	}
	}