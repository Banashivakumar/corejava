package com.xworkz.airlines.jetways;

public class Airways {
	String name;
	String airport;
	long visa;
	byte passangers;
	String[] args=new String[5];
	
	public Airways(String []args)
	{
	System.out.println("passangers in aeroplane");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
public	Airways(String n)
	{
		name = n;
	}
	
	public Airways(String n, String a,long v, byte p)
	{
		this(n);
		this.airport=a;
		this.visa=v;
		this.passangers=p;
	}
	
	public String printAll()
	{
		String display = name + "\t" + airport + "\t" + visa + "\t" +passangers;
		return display;
	}
}