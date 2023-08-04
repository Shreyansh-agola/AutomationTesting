package com.core;

import java.util.Scanner;

public class ArrayTwoDaimentailDemo {
	
	public static void main(String[] args) {
		
		int a[][] = new int[3][3];
		int p,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2D array elements");
		
		for(p=0;p<a.length;p++)
		{
			for(k=0;k<a.length;k++)
			{
				System.out.print("Enter "+p+" Row &  "+k+" Columa : ");
				a[p][k]=sc.nextInt();
			}
		}
		System.out.println("2D Array Is");
		for(p=0;p<a.length;p++)
		{
			for(k=0;k<a.length;k++)
			{
				System.out.println("A["+p+"]["+k+"] = "+a[p][k]);
				
				//when we want data in metric form 
				//System.out.print(" "+a[p][k]);
			}
			//when we want data in metric form
			//System.out.println();
		}
	}

}
