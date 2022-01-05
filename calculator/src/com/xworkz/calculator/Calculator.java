package com.xworkz.calculator;

public class Calculator extends CaluclatorAbstraction {
	
	@Override
	public int  add(int x ,int y) {
		System.out.println("adding two numbers");
		int z=x+y;
        return z;
		}
	
	@Override
	public int sub(int x ,int y) {
		System.out.println("subtracting two numbers");
		int z=x-y;
		return z;
	}
	
	@Override
	public int multiplication(int x,int y) {
		System.out.println("multiplying two numbers");
		 int z=x*y;
			return z;
		}
	
	
	@Override
	public void division(int x,int y) {
		System.out.println("dividing two numbers");
		if(x!=0 && y!=0) {
			int z=x/y;
			System.out.println(z);
		}else {
			System.out.println("enter valid input");
		}
	}

	@Override
	public byte add(byte x,byte y) {
		System.out.println("adding two numbers");
		byte z= (byte) (x+y);
		return z;
	}
	@Override
	public byte sub(byte x,byte y) {
		System.out.println("subtracting two numbers");
		byte z=(byte) (x-y);
		return z;
	}
	@Override
	public byte multiplication(byte x,byte y) {
	    System.out.println("multiplying two numbers");
	   
	    byte z=(byte) (x*y);
	    return z;
	   
	}
	@Override
	public void division(byte x,byte y) {
		System.out.println("dividing two numbers");
		if(x!=0 && y!=0) {
			byte z=(byte) (x/y);
			System.out.println(z);
		}
		}
	@Override
	public long add(long x,long y) {
		System.out.println("adding two numbers");
		long z=(x+y);
		return z;
	}
	@Override
	public long sub(long x,long y) {
		System.out.println("subtracting two numbers");
		long z= (x-y);
		return z;
	}
	@Override
	public long multiplication(long x,long y) {
		System.out.println("multiplying two numbers ");
		long z= (x*y);
		return z;
		
		
	}
	@Override 
	public void division(long x,long y) {
		System.out.println("dividing two numbers");
		if(x!=0 && y!=0) {
			long z= (x/y);
			System.out.println("ans :" +z);
		}
		else {
			System.out.println("enter valid input");
		}
	
	}
	@Override
	public double add(double x,double y) {
		System.out.println("adding two numbers");
		if(x%1 !=0 && y%1 !=0) {
			System.out.println("entered number is integer" +(x+y));
		}
		double z=x+y;
		return z;
		}
	
	@Override
	public double sub(double x,double y) {
		System.out.println("subtracting two numbers");
		double z=x-y;
		return z;
	}
	@Override
	public double multiplication(double x,double y) {
		System.out.println("multiplying two numbers");
			double z=x*y;
			return z;
		
	}
	@Override
	public void division(double x,double y) {
		System.out.println("dividing two numbers");
		if(x!=0 && y!=0) {
			double z=x/y;
			System.out.println("ans :" +z);
		}else {
			System.out.println("inter valid input");
		}
	}
	
	

}
