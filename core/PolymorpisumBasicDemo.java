package com.core;

class A11 {
	A11() 
	{
		System.out.println("A11's Constructor");
	}

	void show() 
	{
		System.out.println("Show From A11");
	}
}

class B11 extends A11 
{
	B11() 
	{
		System.out.println("B11's Constructor");
	}

	void show() 
	{
		/*
		 * which statement is true for constructors that is not true for method so we have to use here super 
		 * keyword to execute show method 
		 */
		super.show();
		System.out.println("Show From B11");
	}
}

class C11 extends B11 
{
	C11() 
	{
		System.out.println("C11's Constructor");
	}

	void show() 
	{
		super.show();
		System.out.println("Show From C11");
	}
}

public class PolymorpisumBasicDemo {
	public static void main(String[] args) {

		C11 c = new C11();
		c.show();

	}

}
