package com.xworkz.leather.quality;
import com.xworkz.leather.quality.Durable;

 class TestDurable {
	public static void main (String []args)
	{
		Durable durable=new Durable(args);
		
		Durable dur=new Durable("different pairs of shoes quality");
		
		
		
		String out=dur.printAll();
		System.out.println(out);
		
		short cost=500;
        int pairs=5;
		
		Durable dura=new Durable("max","flat",cost,pairs);
		String result=dura.printAll();
		System.out.println(result);
    }
}	