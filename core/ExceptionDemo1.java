package com.core;

import java.util.Scanner;

public class ExceptionDemo1 {
public static void main(String[] args) {
		
		System.out.println("start code");
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
			
			int arr[] = {1,2,3,4,5};
			System.out.print("Enter Index Number : ");
			int index=sc.nextInt();
			
			System.out.println("Data Fetched : "+arr[index]);
			
		}
		catch(Exception e)
		//multiple exception na class and object banavi ne na lakhvu hoy to eek j exception no class and
		//eeno object banavi ne lakhi devanu
		{
			System.out.println("Exception Caught");
		}
		
	}

}
