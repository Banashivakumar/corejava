class Remote
{
String name;
String brand;
long price;
float distance;
Remote(String n)
{
name = n;
}
Remote(String n,String b,long p,float d)
{
name = n;
brand = b;
price = p;
distance = d;
}
String printAll()
{
String display = name + "\t" + brand + "\t" + price + "\t" + distance;
return display;
}
}
