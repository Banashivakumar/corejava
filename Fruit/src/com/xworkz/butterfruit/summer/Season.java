package com.xworkz.butterfruit.summer;

public class Season {
	String month;
	String weather;
	float climatecondition ;
	int numberofmonths;
	String[] args=new String[5];
	
 public	Season(String []args)
	{
	System.out.println("number of months");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	public Season(String m)
	{
		month = m;
	}
	
public	Season(String m, String w,float cli, int num)
	{
		this(m);
		this.weather=w;
		this.climatecondition=cli;
		this.numberofmonths=num;
	}
	
public	String printAll()
	{
		String display = month + "\t" + weather + "\t" + climatecondition + "\t" +numberofmonths;
		return display;
	}
}
