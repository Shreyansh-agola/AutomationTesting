package com.core;

class Boxes
{
	Boxes()
	{
		System.out.println("This is a Boxes");
	}
	void show()
	{
		System.out.println("1.This is a void show method");
	}
}
class Box1 extends Boxes
{
	Box1()
	{
		System.out.println("This is a Box1");
	}
	void show()
	{
		super.show();
		System.out.println("2.This is a void show method");
	}
}
class Box2 extends Box1
{
	Box2()
	{
		System.out.println("This is a Box2");
	}
	void show()
	{
		super.show();
		System.out.println("3.This is a void show method");
	}
}
public class PolymorpisumPractise1 {
	public static void main(String[] args) {
		
		Box2 BX=new Box2();
		BX.show();
	}

}
