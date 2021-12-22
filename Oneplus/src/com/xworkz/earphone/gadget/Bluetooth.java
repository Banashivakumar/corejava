package com.xworkz.earphone.gadget;

public class Bluetooth {
	String name;
	String product;
	short price;
	byte numbers;
	String[] args=new String[5];
	
	public Bluetooth(String []args)
	{
	System.out.println("quality of bluetooth is good");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	public Bluetooth(String n)
	{
		name = n;
	}
	
	public Bluetooth(String n, String pr,short p, byte num)
	{
		this(n);
		this.product=pr;
		this.price=p;
		this.numbers=num;
	}
	
	public String printAll()
	{
		String display = name + "\t" + product + "\t" + price + "\t" +numbers;
		return display;
	}
}