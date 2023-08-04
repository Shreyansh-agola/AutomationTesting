package com.core;

import java.util.Scanner;

public class Khanchakker {
    public static void main(String[] args) {
    	double a,b,c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter value of A : ");
			// Khali print lakhiye to eek j laine value input thay//
			
			a=sc.nextDouble();
			System.out.println("Enter value of B : ");
			b=sc.nextDouble();
			c=a+b;
			System.out.println("Addition : "+c);
			c=a*b;
			System.out.println("Multipication : "+c);
	}
}
/*a=2.2;
b=4.6;
c=a+b;
System.out.println("A: "+a);
System.out.println("B : "+b);
System.out.println("Addition : "+c);
*/