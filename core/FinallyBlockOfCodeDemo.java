package com.core;

import java.util.Scanner;

public class FinallyBlockOfCodeDemo {

	public static void demo2() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int x;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter X : ");
		x=sc.nextInt();
		
		if(x>0)
		{
			System.out.println("square of "+x+" is "+(x*x));
		}
		else
		{
			throw new ArithmeticException("Please Enter Positive Values Only.");
		}
	}

	public static void main(String[] args) {
		try
		{
			demo2();
		}
		catch (Exception e)
			{
				System.out.println(e);
			}
		finally
		{
			System.out.println("finally called");
		}
	}
}
