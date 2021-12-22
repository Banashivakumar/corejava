package com.xworkz.innova.materials;

public class Car {
	String name;
	String product;
	short price;
	byte numbers;
	String[] args=new String[5];
	
	public Car(String []args)
	{
	System.out.println("brands of cars");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
 public	Car(String n)
	{
		name = n;
	}
	
	public Car(String n, String pr,short p, byte nu)
	{
		this(n);
		this.product=pr;
		this.price=p;
		this.numbers=nu;
	}
	
	public String printAll()
	{
		String display = name + "\t" + product + "\t" + price + "\t" +numbers;
		return display;
	}
}