package com.core;

public class StaticMethodandBlockDemo {
	
	static int a=10;
	static int b;
	
	//this is a normal block
	{
		System.out.println("Block 1");
	}
	
	//this is a static method 
	static void meth(int x)
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("X : "+x);
	}
	
	//this is a static block
	static
	{
	    System.out.println("Static Block Initialized");	
	    b=a*4;
	}
	
	//again this is a normal block
	{
		System.out.println("Block 2");
	}
	
	public static void main(String[] args) {
		
		//meth method is a static so it can called without creating object
		meth(12);
		
		//normal block call karne or constructor call karne ke liye class ka object banana padta he 
		StaticMethodandBlockDemo s=new StaticMethodandBlockDemo();
	}
	
	public StaticMethodandBlockDemo()
	{
		System.out.println("Default Constuctor Called");
	}

}
