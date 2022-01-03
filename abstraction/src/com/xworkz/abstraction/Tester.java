package com.xworkz.abstraction;

import com.xworkz.abstraction.metro.Greenline;

public class Tester {
	
public static void main (String[] args) {
	Greenline metro=new Greenline();
	metro.greenline();
	metro.purpleline();
	
	Greenline metro1=new Greenline();
	metro.yellowline();
}
}