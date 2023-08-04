package com.core;

import java.util.Scanner;

public class StaticVariableDemo {
	
	
	static int a;
	
	//Static is a keyword
	//static value hoy to last ma je change thayelu hoy eej final output avve
	
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void printvalue()
	{
		System.out.println("A : "+a);
	}
	
	public static void main(String[] args) {
		
		StaticVariableDemo SV1=new StaticVariableDemo();
		StaticVariableDemo SV2=new StaticVariableDemo();
		StaticVariableDemo SV3=new StaticVariableDemo();
		
		SV1.setvalue();
		SV2.setvalue();
		SV3.setvalue();
		
		SV1.printvalue();
		SV2.printvalue();
		SV3.printvalue();
		
	}

}
