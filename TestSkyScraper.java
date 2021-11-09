class TestSkyScraper
{
public static void main(String []args)
{
SkyScraper skyscraper=new SkyScraper("Eiffeltower");
String sky=skyscraper.printAll();
System.out.println(sky);


SkyScraper skyscraper2=new SkyScraper("Eiffeltower",81,5600,20.75f);
System.out.println(skyscraper2.printAll());
}
}
