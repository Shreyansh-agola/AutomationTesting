package com.core;

import java.util.Scanner;

public class ThrowTask {

	public static void demo()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		
		try
		{
		    System.out.print("Enter X : ");
		    x=sc.nextInt();
		    
		    if(x>0)
		    {
		    	System.out.println("Square Of"+x+" Is "+(x*x));
		    }
		    else
		    {
		    	throw new ArithmeticException("please enter positive number only.");
		    }
		}
		    catch(ArithmeticException e)
		    {
		    	System.out.println(e);
		    	demo();
				//when method call itslef it is called recorstion
		    }
	}
	
	public static void main(String[] args) {
		
		demo();
	}
}
