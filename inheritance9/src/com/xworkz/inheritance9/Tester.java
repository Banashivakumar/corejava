package com.xworkz.inheritance9;

import com.xworkz.inheritance9.dto.Oppo;
import com.xworkz.inheritance9.dto.Phone;

public class Tester {
	
	public static void main(String []args) {
		
	    Oppo vivo = new Oppo();
		System.out.println(vivo.company("oppo"));
		System.out.println(vivo.profit((long)(50000)));
		System.out.println(vivo.founder("abc"));
		System.out.println(vivo.models(5));
		System.out.println(vivo.quality(true));
		
		Phone phone = new Phone();
		
		System.out.println(phone.color("black"));
		System.out.println(phone.height(97.45f));
		System.out.println(phone.price((long)25000));
		System.out.println(phone.width((byte)(35)));
		System.out.println(phone.name("oppof11pro"));
		
		
		
		
	}

}
