package com.core;

import java.util.Scanner;

public class IfConditonTask {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
		System.out.print("Enter b :");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.print("A is Getter then B");
		}
		else
		{
			System.out.print("A is less Then B");
		}
	}

}
