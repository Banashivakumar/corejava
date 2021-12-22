package com.xworkz.widening.dto;

public class Widening {

	//Converting from byte;
	public byte a = 5;
	public short b = a;

	public byte x=53;
	public int y= x;

	public byte x1=55;
	public long y1= x1;

	public byte x2=73;
	public float y2= x2;

	public byte x3=94;
	public double y3= x3;

	public boolean x4= (a==b);

	// Converting from short;
	public short c= 7;
	public int d = c;

	public short c1= 5;
	public long d1 = c1;

	public short c2= 25;
	public float d2 = c2;

	public short c3= 45;
	public double d3 = c3;

	public boolean d4 = (c==d);

	//converting from char;
	public char r= 'B';
	public int s = a;

	public char a1= 'b';
	public long r1 = a1;

	public char a2= 'D';
	public float r2 = a2;

	public char a3= 'Z';
	public double r3 = a3;

	public boolean r4= (r1==r2);

	//converting from integer;
	public int i = 135;
	public long j = i;

	public int ii = 25;
	public float j1 = ii;

	public int iw = 85;
	public double j2 = iw;

	public boolean i3 = (i==j1);

	//converting from long;
	public long m = 55550;
	public float n = m;

	public long m1 = 7543;
	public double n1 = m1;

	public boolean m2 = (m==n);

	//converting from float;
	public float rv = 128;
	public double rv1 = rv;

	public boolean res = (rv!=rv1);
	
}
