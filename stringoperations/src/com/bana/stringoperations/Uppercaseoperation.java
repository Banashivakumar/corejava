package com.bana.stringoperations;

public class Uppercaseoperation {
	public static void main(String []args)
	{
	String name = new String("sonu");
	char[] names1 = {'s','o','n','u'};
	char ch = 'n';
	for(int i=0;i<names1.length;i++)
	{
	if(names1[i]>=97  && names1[i]<=122)
	{
		names1[i] =(char) (names1[i]-32);
	}
	}
	System.out.println(names1);
	}

}


























