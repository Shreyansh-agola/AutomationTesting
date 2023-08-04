package com.core;

import java.util.Scanner;

public class FinallyBlockOfCodePractice1 {
	
	public static void demo4() throws ArithmeticException
	{
		int x;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter X : ");
		x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("square of"+x+"circle of x : "+(x*x));
		}
		else
		{
			throw new ArithmeticException("please enter valid input");
		}
	}
	public static void main(String[] args) {
		
		try
		{
			demo4();
		}
		catch (ArithmeticException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("this will be finally execute");
		}
	}

}
