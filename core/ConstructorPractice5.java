package com.core;

class Jigo
{
	double length, height, depth;
	
	Jigo()
	{
		System.out.println("Default Constructor");
		length=3;
		depth=4;
		height=5;
	}
	
	void volume()
	{
		System.out.println("Volume : "+(height*length*depth));
	}
	
}
public class ConstructorPractice5 {
	
	public static void main(String[] args) {
		
		Jigo j=new Jigo();
		j.volume();
	}

}
