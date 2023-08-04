package com.core;

abstract class Shrey
{
	void equal()
	{
		System.out.println("this is a equal method");
	}
	abstract void sum();
}
class Shre extends Shrey
{
	void min()
	{
		System.out.println("this is a shre class method");
	}
	
	void sum()
	{
		System.out.println("this is a method of extended class because it's method is abstarct");
	}
}
public class AbstractMethodPractice1 {
	public static void main(String[] args) {
		
		Shre s=new Shre();
		s.equal();
		s.sum();
		s.min();
	}

}
