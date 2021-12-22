package com.xworkz.cricket.t20;

public class T20 {
	String name;
	long overs;
	String wicketkeeper;
	String coach;
	String captain;
String wicecaptain;
	
public T20(){
	
System.out.println("t20 international");	
}

public T20(int powerplay) {
	this(5.8);
	System.out.println("powerplay " +powerplay);
	
}

public T20(String n){
	this('M');
	name = n;

}

public T20(char g) {
	this(6);
	System.out.println("Gender "+g);
	
}

public T20 (double height) {
	
	System.out.println("Height " +height);
}
public T20(String n,long o, String wk,  String c,String C,String wc){
	this(n);
	this.overs = o;
	this.wicketkeeper = wk;
	this.coach= c;
	this.captain = C;
	
	this.wicecaptain = wc;
	
	
}
public String printAll() {
	String res = name +"\t"+ overs + "\t"+wicketkeeper+"\t"+coach +"\t" +captain+ "\t" +  wicecaptain;
return res;
}


}


