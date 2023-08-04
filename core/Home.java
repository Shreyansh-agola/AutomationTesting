package com.core;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
		int a,b,c,d;
		   
		    Scanner sc=new Scanner(System.in);
		        System.out.println("Enter Value A :");
		    a=sc.nextInt();
		    
		        System.out.println("Enter Value B :");
		    b=sc.nextInt();
		        System.out.println("Enter Value C :");
		    c=sc.nextInt();
		         
		    d=a+b+c;
		    System.out.println("Addition : "+d);
		    d=a*b*c;
		    System.out.println("Multification : "+d);
		    d=a/b/c;
		    System.out.println("Division : "+d);
		    d=a-b-c;
		    System.out.println("Substraction : "+d);
		    
	}
}
