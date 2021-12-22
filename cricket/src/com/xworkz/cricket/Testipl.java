package com.xworkz.cricket;
import com.xworkz.cricket.ipl.Ipl;

class Testipl {

	public static void main(String[] args) {
		
		Ipl ipl= new Ipl();
      
		Ipl ipl1 = new Ipl("RCB",11,"banglore","XYZ","viratkohli","red");
String result = ipl1.printAll();
System.out.println(result);


	}

}
