package com.core;

class Krishaweb0
{
	Krishaweb0()
	{
		System.out.println("This is a Krishaweb0");
	}
	void Tech()
	{
		System.out.println("This is a Krishaweb0 Tech");
	}
}

class Krishaweb1 extends Krishaweb0
{
	Krishaweb1()
	{
		System.out.println("This is a Krishaweb1");
	}
	void Tech()
	{
		super.Tech();
		System.out.println("This is a Krishaweb1 Tech");
	}
}

class Krishaweb2 extends Krishaweb1
{
	Krishaweb2()
	{
		System.out.println("This is a Krishaweb2");
	}
	void Tech()
	{
		super.Tech();
		System.out.println("This is a Krishaweb2 Tech");
	}
}
public class PolymorepisumPractise3 {
	
	public static void main(String[] args) {
		
		Krishaweb2 K=new Krishaweb2();
		K.Tech();
	}

}
