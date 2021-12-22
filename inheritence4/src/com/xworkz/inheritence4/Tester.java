package com.xworkz.inheritence4;

import com.xworkz.inheritence4.dto.Table;
import com.xworkz.inheritence4.dto.Wood;

public class Tester {
	
public static void main(String []args) {
		
		Table table = new Table();
			System.out.println(table.width((byte)(50)));
			System.out.println(table.price(5000));
			System.out.println(table.color("black"));
			System.out.println(table.height(35));
			System.out.println(table.weight((short)(55)));
			
			Wood wood = new Wood();
			
			System.out.println(wood.name("fiber"));
			System.out.println(wood.types(15));
			System.out.println(wood.color("woodenyellow"));
			System.out.println(wood.cost(4500));
			System.out.println(wood.helpful(true));
			
			
			
			
		}

}
