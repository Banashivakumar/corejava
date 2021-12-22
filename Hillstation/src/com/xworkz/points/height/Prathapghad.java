package com.xworkz.points.height;

public class Prathapghad {
	String name;
	String location ;
	int  numberofpoints;
	double distance;
	String[] args=new String[5];
	
	public Prathapghad(String []args)
	{
	System.out.println("different view points");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	public Prathapghad(String n)
	{
		name = n;
	}
	
	public Prathapghad(String n, String loc,int num, double dis)
	{
		this(n);
		this.location=loc;
		this.numberofpoints=num;
		this.distance=dis;
	}
	
	public String printAll()
	{
		String display = name + "\t" + location + "\t" + numberofpoints + "\t" +distance;
		return display;
	}
}