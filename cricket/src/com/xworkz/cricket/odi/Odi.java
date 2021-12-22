package com.xworkz.cricket.odi;

public class Odi {
	String name;
	int overs;
	String wicketkeeper;
	String coach;
	String captain;
String wicecaptain;
	
public Odi(){
	
System.out.println("one day international");	
}

public Odi(long powerplay) {
	this(true);
	System.out.println("powerplay " +powerplay);
	
}

public Odi(String n){
	this('F');
	name = n;

}

public Odi(char g) {
	this(10);
	System.out.println("Gender "+g);
	
}

public Odi (boolean fitness) {
	
	System.out.println("fitness " +fitness);
}
public Odi(String n,int o, String w,  String c,String C,String wc){
	this(n);
	this.overs = o;
	this.wicketkeeper = w;
	this.coach= c;
	this.captain = C;
	
	this.wicecaptain = wc;

	
}
public String printAll() {
	String res = name +"\t"+ overs + "\t"+wicketkeeper+"\t"+coach +"\t" +captain+ "\t"+ wicecaptain;
return res;
}


}

