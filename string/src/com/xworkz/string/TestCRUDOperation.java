package com.xworkz.string;

import com.xworkz.string.operations.CRUDOperation;

public class TestCRUDOperation {

	public static void main(String []args)
	{
		CRUDOperation operation=new CRUDOperation();
		operation.add("bana");
		operation.add("kala");
		operation.add("kumar");
		operation.add("harsha");
		operation.add("sonu");
		operation.add("siddi");
		operation.add("pooja");
		operation.add("neelu");
		operation.add("srushti");
		operation.add("hema");
		
		operation.printAll();
		String result=operation.update("kumar", "shivakumar");
		System.out.println(result);
		operation.printAll();
	}

	}


