package com.xworkz.string;
import com.xworkz.string.operations.Temple;

public class TestTemple {

	public static void main(String []args)
	{
		Temple operation=new Temple();
		operation.add("ganesha");
		operation.add("saibaba");
		operation.add("banashankari");
		operation.add("kempamma");
		operation.add("gowramma");
		operation.add("subramanya");
		operation.add("shiva");
		operation.add("anjenaya");
		operation.add("parvathi");
		operation.add("lakshmi");
		
		operation.printAll();
		
		String result=operation.update("ganesha", "ganeshatemple");
		System.out.println(result);
		String result1=operation.update("saibaba", "saibabatemple");
		System.out.println(result1);
		String result2=operation.update("banashankari", "banashankaritemple");
		System.out.println(result2);
		String result3=operation.update("kempamma", "kempammatemple");
		System.out.println(result3);
		String result4=operation.update("gowramma", "gowrammatemple");
		System.out.println(result4);
		
		operation.printAll();
		String res=operation.delete("banashankaritemple");
		System.out.println("name deleted" +res);
		operation.printAll();
	}
}

