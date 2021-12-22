package com.xworkz.application.mobile;

public class Video {
	String name;
	String material;
	short players;
	byte storage;
	String[] args=new String[5];
	
	public Video(String []args)
	{
	System.out.println("different types of games");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	public Video(String n)
	{
		name = n;
	}
	
 public	Video(String n, String m,short p, byte s)
	{
		this(n);
		this.material=m;
		this.players=p;
		this.storage=s;
	}
	
 public	String printAll()
	{
		String display = name + "\t" + material + "\t" + players + "\t" + storage;
		return display;
	}
}
