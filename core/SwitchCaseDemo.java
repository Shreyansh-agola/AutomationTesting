package com.core;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Substrection");
		System.out.println("3. Multipication");
		System.out.println("4. Division");
		
		System.out.print("Enter your choice : ");
		d=sc.nextInt();
		
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition : "+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Substration : "+c);
			break;
		case 3:
		    c=a*b;
		    System.out.println("Multipication : "+c);
		    break;
		case 4:
			c=a/b;
			System.out.println("Division : "+c);
			break;
		default:
			System.out.println("Invalid Choise");
			break;
		}
	}

}
