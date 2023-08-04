package com.core;

//heranical inheritance

import java.util.Scanner;

class A
//ask sir for why this error happen because program was run with this error

//Answer : Class A is already define in src project classes so you need to change the name from A to anything like A4/A5/AA etc....
{
	int a;

	void getA() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A : ");
		a = sc.nextInt();
	}

	void putA() {
		System.out.println("A : " + a);
	}

	class B extends A {
		int b;

		void getB() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter B : ");
			b = sc.nextInt();
		}

		void putB() {
			System.out.println("B : " + b);
		}
	}

	class C extends A {
		int c;

		void getC() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter C : ");
			c = sc.nextInt();
		}

		void putC() {
			System.out.println("C : " + c);
		}
	}
}

public class InheritancePractice1 {
	public static void main(String[] args) {
		B b1 = new B();
		C c1 = new C();
		b1.getA();
		b1.getB();

		c1.getC();
		b1.putA();
		b1.putB();

		c1.putC();
	}

}
