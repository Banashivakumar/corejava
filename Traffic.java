class Traffic
{
String name;
long vehicals;
int pollution;
double sound;
Traffic(String n)
{
name = n;
}
Traffic(String n,long v,int p,double s)
{
name = n;
vehicals = v;
pollution = p;
sound = s;
}
String printAll()
{
String display = name + "\t" + vehicals + "\t" + pollution + "\t" + sound;
return display;
}
}
