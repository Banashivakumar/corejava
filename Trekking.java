class Trekking
{
String name;
long  price;
int hours ;
float distance;
Trekking(String n)
{
name = n;
}
Trekking(String n,long p,int h,float d)
{
name = n;
price = p;
hours = h;
distance = d;
}
String printAll()
{
String display = name + "\t" + price + "\t" + hours + "\t" + distance;
return display;
}
}
