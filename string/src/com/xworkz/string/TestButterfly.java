package com.xworkz.string;
import com.xworkz.string.operations.Butterfly;

public class TestButterfly {

	public static void main(String []args)
	{
		Butterfly operation=new Butterfly();
		operation.add("annabella");
		operation.add("aponi");
		operation.add("athalia");
		operation.add("atlanta");
		operation.add("ava");
		operation.add("beata");
		operation.add("bellona");
		operation.add("bettina");
		operation.add("caria");
		operation.add("clytia");
		
		operation.printAll();
		
		String result=operation.update("annabella", "annabellabutterfly");
		System.out.println(result);
		String result1=operation.update("aponi", "aponibutterfly");
		System.out.println(result1);
		String result2=operation.update("athalia", "athaliabutterfly");
		System.out.println(result2);
		String result3=operation.update("atlanta", "atlantabutterfly");
		System.out.println(result3);
		String result4=operation.update("ava", "avabutterfly");
		System.out.println(result4);
		
		operation.printAll();
		String res=operation.delete("aponibutterfly");
		System.out.println("name deleted" +res);
		operation.printAll();
	}
}
