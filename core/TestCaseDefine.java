package com.core;

import java.util.Scanner;

/*
 * If we have n number of screen, menu, sub-menu, fields, and input type in fields 
 * so how many test cases we have to create?
 */
public class TestCaseDefine {
	public static void main(String[] args) {
		int a,b,c,d,e,f;
		String type;
		/*
		 * we can check manu and submenu results in 2 type it is bydefult in this program
		 */
		
		/*
		 * we can check string type field in 3 entered values 
		 */
		f=3;
		
		
		/*
		 * a=number of screen
		 * b=number of menu
		 * c=number of sub-menu
		 * d=number of fields in each screen
		 * type=Character input type in field
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Number of Screen :");
		a=sc.nextInt();
		System.out.print("Enter Number of Menu :");
		b=sc.nextInt();
		System.out.print("Enter Number of Sub-Menu :");
		c=sc.nextInt();
		System.out.print("Enter Number of Fields :");
		d=sc.nextInt();
		
		
		e=a*b*c*d*f;
		
		System.out.print("Addition of total = "+ e);
	}

}
