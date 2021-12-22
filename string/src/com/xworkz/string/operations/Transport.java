package com.xworkz.string.operations;

public class Transport {

	String []names=new String[10];
	int index=0;
	public void add(String transportname)
	{
		if(index<names.length)
		{
			names[index]=transportname;
			index++;
		}
		else
		{
			System.out.println("no space");
		}
	}
	public String update(String oldName,String newName) {
		String res=null;
		for(int index=0;index<names.length;index++)
		{
			if(names[index].equals(oldName))
			{
				names[index]=newName;
			}
			res= "Data Updated"+ newName;
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
	public String delete(String name) {
		for(int index=0;index<names.length;index++) {
			if(names[index].equals(name)) {
				names[index]=null;
				return name;
			}
		}
		return null;
	}
}

