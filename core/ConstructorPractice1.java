package com.core;

//Circle Formula 2rd
//r=range and d=daimeter

class Circle
{
	int a=2;
	double range,daimeter;
	
	Circle()
	{
		System.out.println("Default Constructor");
		range=1;
		daimeter=1;
	}
	Circle(int a,double r, double d)
	{
		System.out.println("Parameterized Constructor");
		a=2;
		r=range;
		d=daimeter;
	}
	Circle(Circle A)
	{
		System.out.println("Copy Constructor");
		range=A.range;
		daimeter=A.daimeter;
	}
	void volume()
	{
		System.out.println("Volume = "+(a*range*daimeter));
	}
}
public class ConstructorPractice1 {
	public static void main(String[] args) {
		Circle C1=new Circle();
		C1.volume();
		Circle C2=new Circle(2,1,2);
		C2.volume();
		Circle C3=new Circle(C2);
		C3.volume();
	}

}
