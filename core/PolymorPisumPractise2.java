package com.core;

public class PolymorPisumPractise2 {
	
	void tese1()
	{
		System.out.println("this is a test1");
	}
	void test1(int a1)
	{
		System.out.println("this is a test1 but 1 argument");
	}
	void test2(int a1,int a2)
	{
		System.out.println("this is a test2 but 2 argument");
	}

	public static void main(String[] args) {
		
		PolymorPisumPractise2 PPP2=new PolymorPisumPractise2();
		PPP2.tese1();
		PPP2.test1(10);
		PPP2.test2(15, 20);
	}

}
