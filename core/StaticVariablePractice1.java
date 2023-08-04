package com.core;

import java.util.Scanner;

public class StaticVariablePractice1 {
		
		static double a;
		
		void setvalue()
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter A : ");
			a=sc.nextDouble();
		}
		
		void printvalue()
		{
			System.out.println("A : "+a);
		}
		
		public static void main(String[] args) {
			
			StaticVariablePractice1 SVP1=new StaticVariablePractice1();
			StaticVariablePractice1 SVP2=new StaticVariablePractice1();
			StaticVariablePractice1 SVP3=new StaticVariablePractice1();
			
			SVP1.setvalue();
			SVP2.setvalue();
			SVP3.setvalue();
			
			SVP1.printvalue();
			SVP2.printvalue();
			SVP3.printvalue();
		}

}
