package com.xworkz.cricket.test;

public class Test {
	String name;
	long overs;
	String wicketkeeper;
	String coach;
	String captain;
String wicecaptain;
	
	
public Test(){
	
System.out.println("test matches between countries");	
}

public Test(int powerplay) {
	this(5.8);
	System.out.println("powerplay " +powerplay);
	
}

public Test(String n){
	this('F');
	name = n;

}

public Test(char g) {
	this(10);
	System.out.println("Gender "+g);
	
}

public Test (double height) {
	
	System.out.println("Height " +height);
}
public Test(String n,long o, String wk,String c,String C,String wc){
	this(n);
	this.overs = o;
	this.wicketkeeper = wk;
	this.coach= c;
	this.captain = C;
	
	this.wicecaptain = wc;
	
	
}
public String printAll() {
	String res = name +"\t"+ overs + "\t"+wicketkeeper+"\t"+coach +"\t" +captain+ "\t" + "\t"+ wicecaptain;
return res;
}


}

