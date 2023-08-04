package com.core;

import java.util.Scanner;

public class Home12 {
	public static void main(String[] args) {
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number I : ");
		i=sc.nextInt();
		
		for(i=0;i<=5;i++)
		{
			System.out.println("i : "+i++);
		}
	}

}
