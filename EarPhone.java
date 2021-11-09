class EarPhone
{
String name;
String brand;
long price;
float length;
EarPhone(String n)
{
name = n;
}
EarPhone(String n,String b,long p,float l)
{
name = n;
brand = b;
price = p;
length = l;
}
String printAll()
{
String display = name + "\t" + brand + "\t" + price + "\t" + length;
return display;
}
}
