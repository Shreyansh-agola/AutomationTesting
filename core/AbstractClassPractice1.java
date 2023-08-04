package com.core;

abstract class B2
{
	void get()
	{
		System.out.println("B2 is get by method");
	}
	void put()
	{
		System.out.println("B2 is put with method");
	}
}

class B3 extends B2
{
	void show1()
	{
		System.out.println("B3 is a class which extends with B2 class");
	}
}
public class AbstractClassPractice1 {
	
	public static void main(String[] args) {
		
		B3 b=new B3();
		b.get();
		b.put();
		b.show1();
		
	}

}
