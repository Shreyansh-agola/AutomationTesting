package com.core;

import java.util.Scanner;

public class ExceptionPractice4 {
	
	public static void navya()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		
		c=a/b;
		System.out.println("Division : "+c);
		}
		catch(ArithmeticException o)
		{
			System.out.println("Exception Catch");
			navya();
		}
	}

	public static void main(String[] args) {
		navya();
		
		
	}

}
