package com.xworkz.string;

import com.xworkz.string.operations.Transport;

public class TestTransport {


	public static void main(String []args)
	{
		Transport operation=new Transport();
		operation.add("ship");
		operation.add("air");
		operation.add("water");
		operation.add("train");
		operation.add("bus");
		operation.add("ferry");
		operation.add("road");
		operation.add("light");
		operation.add("commuter");
		operation.add("tram");
		
		operation.printAll();
		
		String result=operation.update("ship", "shiptransport");
		System.out.println(result);
		String result1=operation.update("air", "airtransport");
		System.out.println(result1);
		String result2=operation.update("water", "watertransport");
		System.out.println(result2);
		String result3=operation.update("train", "traintransport");
		System.out.println(result3);
		String result4=operation.update("bus", "bustransport");
		System.out.println(result4);
		
		operation.printAll();
		String res=operation.delete("watertransport");
		System.out.println("name deleted" +res);
		operation.printAll();
	}
}