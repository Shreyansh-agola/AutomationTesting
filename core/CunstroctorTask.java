package com.core;
//2hw rectangle 2LB formula 

class rectangle
{
	double height,width;
	
	rectangle()
	{
		System.out.println("Default Cunstroctor");
		height=3;
		width=4;
	}
	
	rectangle(double h,double w)
	{
		System.out.println("Parameter Cusnstorctor");
		width=w;
		height=h;
	}
	
	rectangle(rectangle r)
	{
		System.out.println("Copy Cunstroctor");
		width=r.width;
		height=r.height;
	}
	
	void volume()
	{
		System.out.println("Volume : "+(2*width*height));
	}
}
public class CunstroctorTask {
	public static void main(String[] args) {
		rectangle b1=new rectangle();
		b1.volume();
		rectangle b2=new rectangle(3,4);
		//because we take 3 value in parameter
		b2.volume();
		rectangle b3=new rectangle(b1);
		b3.volume();
	}

}
