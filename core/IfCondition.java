package com.core;

import java.util.Scanner;

public class IfCondition {
	
	public static void main(String[] args) {
		int a;
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.print("Enetr A: ");
		  
		  a=sc.nextInt();
		  
		  if(a>0)
		  {
			  System.out.print("A is Positive Number");
		  }
		  else
		  {
			  System.out.println("A is Negative number");
		  }
	}

}
