class Cracker
{
String brand;
String types;
short price;
boolean harmful;
String[] args=new String[5];
Cracker(String []args)
{
System.out.println("types of crackers");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
	Cracker (String b)
	{
	brand=b;
	}
	Cracker (String b ,String t,short p,boolean h){
	this(b) ;
	this.types=t;
	this.price=p;
	this.harmful=h;
	}
	String printall(){
	String display=brand +"\t" +type +"\t" +price +"\t" +harmful;
	return display;
	}
	}
