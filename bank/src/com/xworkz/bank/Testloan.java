package com.xworkz.bank;
import com.xworkz.bank.loan.Loan;

 class Testloan {

	public static void main(String[] args) {
		
		Loan loan= new Loan();
      
		Loan loan1 = new Loan("sharath",70000,"tiptur",39.56f,"11/04/2021","34561234589","canarabank");
String result =  loan1.printAll();
System.out.println(result);


	}

}
