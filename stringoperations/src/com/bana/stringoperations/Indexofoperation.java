package com.bana.stringoperations;

public class Indexofoperation {
	public static void main(String [] args)
	{
		String name = new String("bana,saibaba");
		char[]names=name.toCharArray();
		char ch ='a';
		for(int i=0;i<names.length;i++)
		{
			if(ch==names[i])
			{
				names[i]='a';
				System.out.println(i);
			}
			else
			{
				System.out.println(i);
			}
		}
		
		
	}

}
