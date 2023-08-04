package com.core;

class Box
{
	double width,height,depth;
	
	Box()
	//Box is a constructor, 
	//it has no return type it means it is return type 
	//() This is called parameater 
	//When parameter is blank then its default
	{
		System.out.println("Default Cunstroctor");
		width=4;
		height=5;
		depth=6;
	}
	
	Box(double w,double h,double d)
	//when we put value in parameter than its parameterized constructor 
	{
		System.out.println("Perameterized Cunstroctor");
		width=w;
		height=h;
		depth=d;
	}
	
	Box(Box b)
	//when we call other constructor in this constructor then its copy constructor 
	{
		System.out.println("Copy Cunstorctor");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	
	void voulme()
	{
		System.out.println("Volum : "+(width*height*depth));
	}
}
public class CunstructorMainDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.voulme();
		Box b2=new Box(3,4,5);
		//because we take 3 value in parameter
		b2.voulme();
		Box b3=new Box(b1);
		b3.voulme();
		
	}

}
