package com.core;

/*
 * Constructor chaining 
 */

class A1 {
	A1() {
		System.out.println("A1's Constructor");
	}
}

class B1 extends A1 {
	B1() {
		System.out.println("B1's Constructor");
	}
}

class C1 extends B1 {
	C1() {
		System.out.println("C1's Constructor");
	}
}

public class CunstroctorandinheritanceDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		// C1 class che and c object nu name che
	}

}
