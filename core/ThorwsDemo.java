package com.core;

import java.util.Scanner;

public class ThorwsDemo {
	
	public static void demo1() throws ArithmeticException,ArrayIndexOutOfBoundsException
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
			demo1();
		}
		catch (Exception e)
			{
				System.out.println(e);
			}
	}
}
