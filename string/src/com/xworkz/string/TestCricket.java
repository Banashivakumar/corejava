
package com.xworkz.string;
import com.xworkz.string.operations.Cricket;

public class TestCricket {
	
	public static void main(String []args)
	{
		Cricket operation=new Cricket();
		operation.add("kholi");
		operation.add("rahul");
		operation.add("rohith");
		operation.add("mayank");
		operation.add("hardik");
		operation.add("rishab");
		operation.add("sachin");
		operation.add("padikal");
		operation.add("bharath");
		operation.add("dravid");
		
		operation.printAll();
		String result=operation.update("kholi", "viratkholi");
		System.out.println(result);
		String result1=operation.update("rahul", "klrahul");
		System.out.println(result1);
		String result2=operation.update("rohith", "rohithsharma");
		System.out.println(result2);
		String result3=operation.update("mayank", "mayankagarawal");
		System.out.println(result3);
		String result4=operation.update("padikal", "devduttpadikal");
		System.out.println(result4);
		
		operation.printAll();
		String res=operation.delete("klrahul");
		System.out.println("name deleted" +res);
		operation.printAll();
		}
		
		
}

