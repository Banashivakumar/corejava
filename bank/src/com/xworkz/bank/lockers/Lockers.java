package com.xworkz.bank.lockers;

public class Lockers {
	String bank;
	int id;
	boolean secure;;
	float balance;
	String place;
	String color;
	String shape;
	
public Lockers(){
	
System.out.println("lockers details in bank");	
}

public Lockers(int keys) {
	this(6.8d);
	System.out.println("Keys " +keys);
	
}

public Lockers(String b){
	this('M');
	bank = b;

}

public Lockers(char managergender) {
	this(6000);
	System.out.println("Managergender "+managergender);
	
}

public Lockers (double height) {
	
	System.out.println("Height " +height);
}
public Lockers(String b,int i, boolean s, float B, String p,String c,String S){
	this(b);
	this.id = i;
	this.secure = s;
	this.balance= B;
	this.place = p;
	
	this.color = c;
	this.shape=S;
	
}
public String printAll() {
	String res = bank +"\t"+ id + "\t"+secure+"\t"+balance +"\t" +place+ "\t" + color+"\t"+shape;
return res;
}


}

