package com.xworkz.bank.employee;

public class Employee {
	String name;
	long phone;
	String place;
	float salary;
	String designation;
	String email;
	String eid;
	
public Employee(){
	
System.out.println("employee details working in bank");	
}

public Employee(int adarcardNo) {
	this(5.8);
	System.out.println("AdarcardNo " +adarcardNo);
	
}

public Employee(String n){
	this('M');
	name = n;

}

public Employee(char g) {
	this(6055);
	System.out.println("Gender "+g);
	
}

public Employee (double height) {
	
	System.out.println("Height " +height);
}
public Employee(String n,long p, String P, float s, String d,String e,String ei){
	this(n);
	this.phone = p;
	this.place = P;
	this.salary= s;
	this.designation = d;
	
	this.email = e;
	this.eid=ei;
	
}
public String printAll() {
	String res = name +"\t"+ phone + "\t"+place+"\t"+salary +"\t" +designation+ "\t" + "\t"+ email+"\t"+eid;
return res;
}


}

