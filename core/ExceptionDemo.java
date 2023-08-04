package com.core;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		System.out.println("start code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		try
		//jya lagtu hoy ke exception tashe tya ee vastu try ma lakhvanu
		{
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			
			c=a/b;
			//aahiya aapnne lage che ke user 0 nakhshe division ma to exception tashe 
			System.out.println("Division : "+c);
			
			int arr[] = {1,2,3,4,5};
			System.out.print("Enter Index Number : ");
			int index=sc.nextInt();
			
			System.out.println("Data Fetched : "+arr[index]);
			
		}
		catch(ArithmeticException e)
		//e is an object of ArithmeticException(it is a java inbuid class) class
		//try expection ne throw karshe and catch pakdi leshe and solve karshe 
		{
			System.out.println("Exception Caught");
		}
		//aa catch thai jashe to niche vadu catch nai kare  
		//eek program ma bauu badha exception hoy to catch pan aadpe bauu badha lakhi sakiye 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Second Exception Caught");
		}
		System.out.println("End Code");
	}

}
