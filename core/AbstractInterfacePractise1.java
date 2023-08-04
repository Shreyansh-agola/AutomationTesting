package com.core;

interface B22
{
	static void Good()
	{
		System.out.println("this is good of B2 interface");
	}
	void Bad();
}

interface B33 extends B22
{
	void Bad1();
}
class Bittu implements B22
{
	public void Bad1()
	{
		System.out.println("this is a interface method which are also define in other class");
	}
	public void Bad()
	{
		System.out.println("this is a interface method which are define in other class");
	}
}
public class AbstractInterfacePractise1 {
	public static void main(String[] args) {
		
		Bittu bi=new Bittu();
		bi.Bad();
		B22.Good();
		//this is a static method so it called by class name here class is an insterface and interface is 
		//class name it's work like abstarct class.
		bi.Bad1();
	}

}
