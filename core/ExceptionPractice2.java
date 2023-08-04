package com.core;

import java.util.Scanner;

public class ExceptionPractice2 
{
	public static void shrey()
	{
		int a;
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.print("Enter A : ");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Square of " +a+" Is : "+(a*a));
		}
		else 
		{
			throw new ArithmeticException("Please Enter Postive Number");
		}
		
		}
		catch(ArithmeticException on)
		{
			System.out.println(on);
			shrey();
		}
		
	}

	public static void main(String[] args) {
		
		shrey();
	}

}