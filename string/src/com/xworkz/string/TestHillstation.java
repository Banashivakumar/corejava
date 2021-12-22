package com.xworkz.string;

import com.xworkz.string.operations.Hillstation;

public class TestHillstation {

	public static void main(String []args)
	{
		Hillstation operation=new Hillstation();
		operation.add("coorg");
		operation.add("chikmagalur");
		operation.add("kemmangundi");
		operation.add("nandi");
		operation.add("agumbae");
		operation.add("kudremukh");
		operation.add("kodachadri");
		operation.add("munnar");
		operation.add("yana");
		operation.add("kodagu");
		
		operation.printAll();
		
		String result=operation.update("coorg", "coorghills");
		System.out.println(result);
		String result1=operation.update("chikmagalur", "chikmagalurhills");
		System.out.println(result1);
		String result2=operation.update("kemmangundi", "kemmangundihills");
		System.out.println(result2);
		String result3=operation.update("nandi", "nandihills");
		System.out.println(result3);
		String result4=operation.update("agumbae", "agumbaehills");
		System.out.println(result4);
		
		operation.printAll();
	}
}
