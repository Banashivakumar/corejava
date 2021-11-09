class KeyBoard
{
String name;
String windows;
int keys;
long letters;
KeyBoard(String n)
{
name = n;
}
KeyBoard(String n,String w,int k,long l)
{
name = n;
windows = w;
keys = k;
letters = l;
}
String printAll()
{
String display = name + "\t" + windows + "\t" + keys + "\t" + letters;
return display;
}
}
