package com.xworkz.butterfruit.summer;

 class TestSeason {
	public static void main (String []args)
	{
		Season season=new Season(args);
		
		Season sea=new Season("rainfall");
		
		
		
		String out=sea.printAll();
		System.out.println(out);
		
		float climatecondition=46.98f;
        int numberofmonths =4;
		
	com.xworkz.butterfruit.summer.Season seas=new com.xworkz.butterfruit.summer.Season("april","hot",climatecondition,numberofmonths);
		String result=seas.printAll();
		System.out.println(result);
    }
}	