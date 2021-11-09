class TestAeroplane
{
public static void main (String []args)
{
Aeroplane plane=new Aeroplane(args);
Aeroplane aeroplane=new Aeroplane("spicejet");
String Fly=ap.printall();
System.out.println(Fly);
short yoc=2012;
float width=187.5f;
Aeroplane fly=new Aeroplane("IA","delhi", yoc,width);
String result=fly.printAll();
System.out.println(result);
}
}