package com.xworkz.bank;
import com.xworkz.bank.accountholder.Accountholder;

 class Testaccountholder {

	public static void main(String[] args) {
		
		Accountholder accountholder= new Accountholder();
      
		Accountholder accountholder1 = new Accountholder("nityha",99350,"arsikere",7.9f,"AC5IH7GHYJ","1234567890","SBI");
String result =  accountholder1.printAll();
System.out.println(result);


	}

}
