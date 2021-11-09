class SkyScraper
{
String name;
int antenna ;
long metalweight;
float height;
SkyScraper(String n)
{
name = n;
}
SkyScraper(String n,int a,long m,float h)
{
name = n;
antenna = a;
metalweight = m;
height = h;
}
String printAll()
{
String display = name + "\t" + antenna + "\t" + metalweight + "\t" + height;
return display;
}
}
