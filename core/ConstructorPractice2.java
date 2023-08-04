package com.core;

class Ractangle
{
	double width,length;
	Ractangle()
	{
		System.out.println("This is a Ractangle Default Constructor");
		width=10;
		length=20;
	}
	Ractangle(double w, double l)
	{
		System.out.println("This is a Ractangle Parameterize Constructor");
		w=width;
		l=length;
	}
	Ractangle(Ractangle R)
	{
		System.out.println("This is a Ractangle Copy Constructor");
		width=R.width;
		length=R.length;
	}
	void volume()
	{
		System.out.println("Volume = "+(width*length));
	}
}
public class ConstructorPractice2 {
	public static void main(String[] args) {
		Ractangle R1=new Ractangle();
		R1.volume();
		Ractangle R2=new Ractangle(10,20);
		R2.volume();
		Ractangle R3= new Ractangle(R2);
		R3.volume();
		
	}

}
