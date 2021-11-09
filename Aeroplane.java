class Aeroplane
{
String name;
String location;
short yoc;
float width;
String[] args=new String[5];
Aeroplane(String []args)
{
System.out.println("indian airlines");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
	Aeroplane (String n)
	{
	name=n;
	}
	Aeroplane (String n ,String l,short y,float w){
	this(n) ;
	this.location=l;
	this.yoc=y;
	this.width=w;
	}
	String printall(){
	String display=name +"\t" +location +"\t" +yoc +"\t" +width;
	return display;
	}
	}
