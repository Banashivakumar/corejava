package com.bana.stringoperations;

public class Replaceoperation {
	public static void main(String []args)
	{
		String name=new String("Bana");
		char[] names= {'B','a','n','a'};
		char ch='n';
		for(int i=0;i<names.length;i++)
		{
			if(ch==names[i])
			{
				names[i]='a';
			}
		}
		System.out.println(names);
	}

}
