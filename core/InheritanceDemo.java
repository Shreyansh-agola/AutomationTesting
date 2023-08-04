package com.core;

//single inheritance & multilevel inheritance

/*
 * 2 class hoy to single and 2 thi vadhare hoy to multilevel
 * get and put functions che 
 * pink color ma hoy ee keyword
 * new keyword che jo memory occupie karta he
 * Agar me without new likhta hu to wo referance hota he kyuki uusne memory occupia nai ki
 */


import java.util.Scanner;

class A
{
	int a;
	void getA()
	//getA is a just name of method 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void putA()
	{
        System.out.println("A : "+a);
	}
}	
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B : ");
		b=sc.nextInt();	
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C extends B
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C : ");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		C c1=new C();
		c1.getA();
		c1.getB();
		c1.getC();
		c1.putA();
		c1.putB();
		c1.putC();
	}

}




