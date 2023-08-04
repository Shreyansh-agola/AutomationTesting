package com.core;

public class PolymorpisumOverloadingDemo {

	void test() {
		System.out.println("test with no argument");
	}

	void test(int a) {
		System.out.println("test with 1 argument");
	}

	void test(int a, int b) {
		System.out.println("test with 2 argument");
	}

	public static void main(String[] args) {
		PolymorpisumOverloadingDemo p = new PolymorpisumOverloadingDemo();
		p.test(12, 20);
		p.test();
		p.test(35);

	}

}
