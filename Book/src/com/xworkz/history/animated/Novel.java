package com.xworkz.history.animated;

public class Novel {
	String name;
	String author;
	short price;
	byte numberofpages;
	String[] args=new String[5];
	
	public Novel(String []args)
	{
	System.out.println("story books to read");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	public Novel(String n)
	{
		name = n;
	}
	
	public Novel(String n, String a,short p, byte num)
	{
		this(n);
		this.author=a;
		this.price=p;
		this.numberofpages=num;
	}
	
	public String printAll()
	{
		String display = name + "\t" + author + "\t" + price + "\t" +numberofpages;
		return display;
	}
}
