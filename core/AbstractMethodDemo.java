package com.core;

abstract class Abs2
{
	void meth2()
	{
		System.out.println("Meth2 in Abs2");
	}
	abstract void meth3();
	//we have to complate the sentance with semi colum 
}

class Abs3 extends Abs2
{
	void meth3()
	{
		System.out.println("Meth3 in Abs2");
		//we have to define body part in without abstacte class
	}
}

public class AbstractMethodDemo {
	public static void main(String[] args) {
		
		Abs3 a=new Abs3();
		a.meth2();
		a.meth3();
	}

}
