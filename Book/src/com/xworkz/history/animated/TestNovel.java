package com.xworkz.history.animated;

 class TestNovel {
	public static void main (String []args)
	{
		Novel novel=new Novel(args);
		
		Novel novels=new Novel("good novels to read");
		
		
		
		String out=novels.printAll();
		System.out.println(out);
		
		short price=500;
        byte numberofpages=86;
		
	com.xworkz.history.animated.Novel nov=new com.xworkz.history.animated.Novel("wingsoffire","apjabdulkalam",price,numberofpages);
		String result=nov.printAll();
		System.out.println(result);
    }
}	