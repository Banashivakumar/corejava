class MusicInstrument
{
String name;
String brand;
long price;
double wavelength;
MusicInstrument(String n)
{
name = n;
}
MusicInstrument(String n,String b,long p,double w)
{
name = n;
brand = b;
price = p;
wavelength = w;
}
String printAll()
{
String display = name + "\t" + brand + "\t" + price + "\t" + wavelength;
return display;
}
}
