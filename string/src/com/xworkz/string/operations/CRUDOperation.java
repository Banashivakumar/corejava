package com.xworkz.string.operations;

public class CRUDOperation {
	

	String[]names=new String[10];
	int index=0;
	public void add(String name)
	{
		if(index<10)
		{
	names[index]=name;
	index++;
	}
		else
		{
			System.out.println("no space");
		}
	}
	public String update(String oldName,String newName)
	{
		String res=null;
		for(int index=0;index<names.length;index++)
		{
			if(names[index].equals(oldName))
			{
				names[index]=newName;
				res="Data Updated";
			}
		}
		return res;
	}
	public void printAll()
	{
		for(int index=0;index<names.length;index++)
		{
			System.out.println(names[index]);
			}
		}
	}
