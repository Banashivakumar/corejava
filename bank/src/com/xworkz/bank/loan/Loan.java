package com.xworkz.bank.loan;

public class Loan{
	String name;
	long income;
	String address;
	float interest;
	String date;
	String accountnumber;
	String bank;
	
public Loan(){
	
System.out.println("one who is taking loan in bank");	
}

public Loan(int phone) {
	this(5.2d);
	System.out.println("Phone " +phone);
	
}

public Loan(String n){
	this('M');
	name = n;

}

public Loan(char g) {
	this(9945);
	System.out.println("Gender "+g);
	
}

public Loan (double height) {
	
	System.out.println("Height " +height);
}
public Loan(String n,long i, String a, float I, String d,String ac,String B){
	this(n);
	this.income = i;
	this.address = a;
	this.interest= I;
	this.date = d;
	
	this.accountnumber = ac;
	this.bank=B;
	
}
public String printAll() {
	String res = name +"\t"+ income + "\t"+address+"\t"+interest +"\t" +date+ "\t" + accountnumber+"\t"+bank;
return res;
}


}

