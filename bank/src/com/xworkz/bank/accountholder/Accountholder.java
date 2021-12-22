package com.xworkz.bank.accountholder;

public class Accountholder {
	String name;
	int phone;
	String address;
	float balance;
	String ifsc;
	String accountnumber;
	String bank;
	
public Accountholder(){
	
System.out.println("accountholder details who has created account in bank");	
}

public Accountholder(int income) {
	this(6.8d);
	System.out.println("Income " +income);
	
}

public Accountholder(String n){
	this('F');
	name = n;

}

public Accountholder(char g) {
	this(6000);
	System.out.println("Gender "+g);
	
}

public Accountholder (double height) {
	
	System.out.println("Height " +height);
}
public Accountholder(String n,int p, String a, float b, String i,String ac,String B){
	this(n);
	this.phone = p;
	this.address = a;
	this.balance= b;
	this.ifsc = i;
	
	this.accountnumber = ac;
	this.bank=B;
	
}
public String printAll() {
	String res = name +"\t"+ phone + "\t"+address+"\t"+balance +"\t" +ifsc+ "\t" + accountnumber+"\t"+bank;
return res;
}


}

