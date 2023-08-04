package com.core;

public class StaticFullPractice {
	
	static int a;
	
	static 
	{
		System.out.println("this is a static block");
	}
	
	static void meth2(int i)
	{
		System.out.println("this is a static method"+i);
	}
	
	public static void main(String[] args) {
		
		meth2(20);
		StaticFullPractice SFP=new StaticFullPractice();
	}

}
