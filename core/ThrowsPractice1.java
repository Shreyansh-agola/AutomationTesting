package com.core;

import java.util.Scanner;

public class ThrowsPractice1 {
	
	public static void demo3() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int a;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter X : ");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("this int "+a+ " is a positive");
		}
		else
		{
			throw new ArithmeticException("negetive or zero, please enter positive num");
		}
	}	
	public static void main(String[] args) {
	try
	{
		demo3();
	}
	catch (ArithmeticException e)
	{
		System.out.println(e);
	}

}
}
