package com.core;

import java.util.Scanner;

public class ExceptionPractice3 {
	
	public static void etam()
	{
		int a;
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Validation Sucessfully Clear");
		}
		else
		{
			throw new ArithmeticException("Error Message");
		}
		}
		catch(ArithmeticException io)
		{
			System.out.println("Error Message");
			etam();
		}
	}
	
	public static void main(String[] args) {
		etam();
	}

}
