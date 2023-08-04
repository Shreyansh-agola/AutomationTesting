package com.core;

import java.util.Scanner;

public class Homewhile12 {

	public static void main(String[] args) {
		int n, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number N : ");
		n = sc.nextInt();
		while(n>0)
		{
		    sum=sum+n;
		    n--;
		}
		System.out.println("Addition of Number N : "+sum);
	}
}
