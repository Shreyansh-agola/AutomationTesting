package com.core;

import java.util.Scanner;

public class ExceptionPractice1 {
	public static void main(String[] args) {
		
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		
		try
		{
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		System.out.print("Enter C : ");
		c=sc.nextInt();
		
		d=a+b;
		e=d/c;
		
		int arr[] = {1,4,5,6};
		System.out.print("Enter Array Index Num : ");
		int index= sc.nextInt();
		
		System.out.println("Data Fetch : "+arr[index]);
		
		System.out.println("Sum of A+B = "+d);
		System.out.println("Division of D/C = "+e);
		}
//		catch(Exception n)
//		{
//			System.out.println("Exception Catch");
//		}
		catch(ArithmeticException ae)
     	{
			System.out.println("Exception catch");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("Exception Catch 2");
		}
	}

}
