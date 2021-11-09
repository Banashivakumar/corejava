class SkyScraper
{
String name;
String location;
short yoc;
float height;
String[] args=new String[5];
SkyScraper(String []args)
{
System.out.println("different skyscraper are follows");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
	SkyScraper (String n)
	{
	name=n;
	}
	SkyScraper (String n ,String l,short y,float h){
	this(n) ;
	this.location=l;
	this.yoc=y;
	this.height=h;
	}
	String printall(){
	String display=name +"\t" +location +"\t" +yoc +"\t" +height;
	return display;
	}
	}
