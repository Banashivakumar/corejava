package com.bana.stringoperations;

public class Teststring {
	public static void main(String []args)
	{
		String name = new String("puneeth");
		char ch=name.charAt(5);
		System.out.println(ch);
		
	    String name1 = new String("yash");
		boolean ch1= name1.contains("yash");
		System.out.println(ch1);
		
		String name2 = new String("kala");
		String ch2= name2.concat("shivakumar");
		System.out.println(ch2);
		
		String name3 = new String("spoo");
		boolean ch3= name3.equals("spoo");
		System.out.println(ch3);
		
		String name4 = new String("swamy");
		int ch4= name4.indexOf("swamy");
		System.out.println(ch4);
		
		String name5 = new String("");
		boolean ch5= name5.isEmpty();
		System.out.println(ch5);
		
		String name6 = new String("siddi");
		int ch6= name6.length();
		System.out.println(ch6);
		
		String name7 = new String("sonu");
		String ch7= name7.replace("sonu","siddi");
		System.out.println(ch7);
		
		String name8 = new String("srushti");
		char ch8[]=name8.toCharArray();
		System.out.println(ch8);
		
		String name9 = new String("nithya");
		String ch9=name9.toLowerCase();
		System.out.println(ch9);
		
		String name10 =new String("neelu,neelamma");
		String[] ch10= name10.split(",");
		for(int index=0;index<ch10.length;index++)
		{
		System.out.println(ch10[index]);
		}
		
		String name11 = new String("pooja");
		String ch11=name11.toUpperCase();
		System.out.println(ch11);
				}
	

}
