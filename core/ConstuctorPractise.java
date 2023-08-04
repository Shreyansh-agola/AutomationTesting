package com.core;

class Practise 
{
	double width,height,length;
	
	Practise()
	{
		System.out.println("This is a Default Constructor");
		width=1;
		height=2;
		length=3;
	}
	Practise(double w,double h,double l)
	{
		System.out.println("Parameterized Constructor");
		w=width;
		h=height;
		l=length;
	}
	Practise(Practise A)
	{
		System.out.println("Copy Constructor");
		width=A.width;
		height=A.height;
		length=A.length;
	}
	void Volume()
	{
		System.out.println("Volume : "+(width*height*length));
	}
}
public class ConstuctorPractise {
	public static void main(String[] args) {
		
		Practise P1=new Practise();
		P1.Volume();
		Practise P2=new Practise(4,5,6);
		P2.Volume();
		Practise P3=new Practise(P2);
		P3.Volume();
				
	}

}
