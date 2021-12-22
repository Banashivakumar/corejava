package com.bana.stringoperations;

public class Lowercaseoperation {
 
public static void main(String []args)
{
	String name = new String("KALA");
	char[] characters = {'K','A','L','A'};
	char ch ='L';
	for(int i=0;i<characters.length;i++)
	{
		if(characters[i]>=65 && characters[i]<=90) {
			characters[i] =(char) (characters[i]+32);
			
		}
	}
	System.out.println(characters);
}
}































