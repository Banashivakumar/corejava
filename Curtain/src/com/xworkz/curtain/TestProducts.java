package com.xworkz.curtain;
import com.xworkz.curtain.cotton.Products;

public class TestProducts {
	public static void main (String []args)
	{
		Products products=new Products(args);
		
		Products pro=new Products("windowdecor");
		
		
		
		String out=pro.printAll();
		System.out.println(out);
		
		short price=50;
        byte numbers=8;
		
		Products prod=new Products("doordecor",price,numbers);
		String result=prod.printAll();
		System.out.println(result);
    }
}	