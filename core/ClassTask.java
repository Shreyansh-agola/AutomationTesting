package com.core;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number N :");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
			/*
			 * Task = Initialization n number thi karvu che increment and decrement banee
			 * to ??
			 */
		{
			sum=sum+i;
		}
		System.out.println("sum : "+sum);
		
		
	}

}
