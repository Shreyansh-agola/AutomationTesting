package com.core;

import java.util.Scanner;

public class Scannerfunction {
      public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A : ");
		// Khali print lakhiye to eek j laine value input thay//
		
		a=sc.nextInt();
		System.out.println("Enter value of B : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
	}
        
}
