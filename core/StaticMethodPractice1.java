package com.core;

public class StaticMethodPractice1 {
	
	void meth()
	{
		System.out.println("this is a nonstatic method");
	}
	
	static void meth1()
	{
		System.out.println("This is a Static Method");
	}
	
	public static void main(String[] args) {
		
		meth1();
		StaticMethodPractice1 SMP1=new StaticMethodPractice1();
	}
	
	public StaticMethodPractice1() 
	{
		System.out.println("This is a constructor");
	
	}

}
