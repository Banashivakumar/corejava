class TestSkyScrapper
{
public static void main (String []args)
{
SkyScraper sky=new SkyScraper(args);

SkyScraper Sky=new SkyScraper("Eiffiltower");
String res=sky.printall();
System.out.println(res);
short yoc=1889;
float height=1055.3f;
SkyScraper sp=new SkyScraper("Eiffiltower","paris",yoc,height);
String result=sp.printall();
System.out.println(result);
}
}