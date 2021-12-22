package com.xworkz.airlines.jetways;

 class TestAirways {
	public static void main (String []args)
	{
		Airways airways=new Airways(args);
		
		Airways air=new Airways("aeroplanes in airport");
		
		
		
		String out=air.printAll();
		System.out.println(out);
		
		long visa=500000;
        byte passangers=20;
		
		com.xworkz.airlines.jetways.Airways planes=new com.xworkz.airlines.jetways.Airways("britishairways","banglore",visa,passangers);
		String result=planes.printAll();
		System.out.println(result);
    }
}	
