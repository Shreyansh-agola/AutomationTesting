package com.core;

import java.util.Scanner;

public class OddandEvenNumer {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		
		if(a%2==0)
			/*
			 * '%' that is called modulo devision 
			 */
		{
			System.out.print("A is Even Number");
		}
		else
		{
			System.out.print("A is Odd Numebr");
		}
	}

}
