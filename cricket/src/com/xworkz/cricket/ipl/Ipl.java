package com.xworkz.cricket.ipl;

public class Ipl {
	String name;
	int players;
	String place;
	String coach;
	String captain;
String color;
	
public Ipl(){
	
System.out.println("indian primere league");	
}

public Ipl(long invest) {
	this(6.2);
	System.out.println("Invest " +invest);
	
}

public Ipl(String n){
	this('M');
	name = n;

}

public Ipl(char g) {
	this(605500);
	System.out.println("Gender "+g);
	
}

public Ipl (double height) {
	
	System.out.println("Height " +height);
}
public Ipl(String n,int p, String s, String c, String C,String co){
	this(n);
	this.players = p;
	this.place = s;
	this.coach= c;
	this.captain = C;
	
	this.color = co;
	
	
}
public String printAll() {
	String res = name +"\t"+ players + "\t"+place+"\t"+coach +"\t" +captain+ "\t" + color;
return res;
}


}

