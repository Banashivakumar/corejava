package com.xworkz.points.height;
import com.xworkz.points.height.Prathapghad;

 class TestPrathapghad {
	public static void main (String []args)
	{
		Prathapghad prathapghad=new Prathapghad(args);
		
		Prathapghad prathap=new Prathapghad("beautifulviewpoint");
		
		
		
		String out=prathap.printAll();
		System.out.println(out);
		
		int numberofpoints=50;
        double distance=80.99d;
		
		Prathapghad ghad=new Prathapghad("rainbowmountain","china",numberofpoints,distance);
		String result=ghad.printAll();
		System.out.println(result);
    }
}	