package com.core;

class Ellipse
{
	double a,b;
	double p=3.14;
	
	Ellipse()
	{
		System.out.println("default constructor");
		a=25.4;
		b=30.5;
		p=3.14;
	}
	Ellipse(double a, double b, double p)
	{
		System.out.println("parameterize constructor");
		a=25.4;
		b=30.5;
		p=3.14;
	}
	Ellipse(Ellipse E)
	{
		System.out.println("copy constructor");
		a=E.a;
		b=E.b;
		p=E.p;
	}
	void volume()
	{
		System.out.println("Volume = "+(a*b*p));
	}
}
public class ConstructorPractise4 {
	public static void main(String[] args) {
		Ellipse E1=new Ellipse();
		E1.volume();
		Ellipse E2=new Ellipse(25.4,30.5,3.14);
		E2.volume();
		Ellipse E3=new Ellipse(E2);
		E3.volume();
		
	}

}
