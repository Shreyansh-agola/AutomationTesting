package com.core;

public class StaticBlockPractice1 {
	
	{
		System.out.println("this is a normal block");
	}
	
	static
	{
		System.out.println("This is a Static Block");
	}
	
	{
		System.out.println("this is a again normal block");
	}
	
	public static void main(String[] args) {
		StaticBlockPractice1 SBP1=new StaticBlockPractice1();
	}

}
