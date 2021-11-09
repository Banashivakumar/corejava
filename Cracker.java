class Cracker
{
String name;
int quantity;
long price;
double sound;
Cracker(String n)
{
name = n;
}
Cracker(String n,int q,long p,double s)
{
name = n;
quantity = q;
price = p;
sound = s;
}
String printAll()
{
String display = name + "\t" + quantity + "\t" + price + "\t" + sound;
return display;
}
}
