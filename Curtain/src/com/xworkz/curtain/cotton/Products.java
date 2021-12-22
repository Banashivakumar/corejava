package com.xworkz.curtain.cotton;

public class Products {
	String name;
	short price;
	byte numbers;
	String[] args=new String[5];
	
	public Products(String []args)
	{
	System.out.println("varities of products");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
public	Products(String n)
	{
		name = n;
	}
	
	public Products(String n,short p, byte nu)
	{
		this(n);
		this.price=p;
		this.numbers=nu;
	}
	
	public String printAll()
	{
		String display = name  + "\t" + price + "\t" +numbers;
		return display;
	}
}