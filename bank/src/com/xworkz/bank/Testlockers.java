package com.xworkz.bank;
import com.xworkz.bank.lockers.Lockers;

 class Testlockers {

	public static void main(String[] args) {
		
		Lockers lockers= new Lockers();
      
		Lockers lockers1 = new Lockers("SBI",21,true,80.56f,"tiptur","orange","square");
String result =  lockers1.printAll();
System.out.println(result);


	}

}
