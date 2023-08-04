package com.core;

class Parallelogram
{
	double base,height;
	
	Parallelogram()
	{
		System.out.println("this is a Parallelogram defult constructor");
		base=30;
		height=15;
	}
	Parallelogram(double b, double h)
	{
		System.out.println("this is a Parallelogram parameterize constructor");
		b=base;
		h=height;
	}
	Parallelogram(Parallelogram P)
	{
		System.out.println("this is a Parallelogram copy constroctor");
		base=P.base;
		height=P.height;
	}
	void volume()
	{
		System.out.println("This Is a Volume = "+(base*height));
	}
}
public class ConstructorPractise3 {
	public static void main(String[] args) {
		Parallelogram P1=new Parallelogram();
		P1.volume();
		Parallelogram P2=new Parallelogram(60,30);
		P2.volume();
		Parallelogram P3=new Parallelogram(P1);
		P3.volume();
	}

}
