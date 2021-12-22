package com.xworkz.leather.quality;

public class Durable {
	String name;
	String product;
	short cost;
	int pairs;
	String[] args=new String[5];
	
	public Durable(String []args)
	{
	System.out.println("different quality shoes");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	public Durable(String n)
	{
		name = n;
	}
	
	public Durable(String n, String pr,short c, int p)
	{
		this(n);
		this.product=pr;
		this.cost=c;
		this.pairs=p;
	}
	
  public	String printAll()
	{
		String display = name + "\t" + product + "\t" + cost + "\t" + pairs;
		return display;
	}
}