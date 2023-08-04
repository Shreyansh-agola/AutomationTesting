package com.core;

//interface is a keyword which is same as class

interface ifs1
{
	static void meth1()
	{
		System.out.println("this is a static mehtod");
	}
	//if I define void meth1 method as a static then i can create body part in interface still it is
	//abstract 
	void meth2();
}
interface ifs2 extends ifs1
{
	void meth3();
	void meth4();
}

class ImplInterface implements ifs2
{
	public void meth2()
	{
		System.out.println("meth2");
	}
	public void meth3()
	{
		System.out.println("meth3");
	}
	public void meth4()
	{
		System.out.println("meth4");
	}
}
public class AbstactInterfaceDemo {
	public static void main(String[] args) {
		
		ImplInterface i=new ImplInterface();
		ifs1.meth1();
		i.meth2();
		i.meth3();
		i.meth4();
	}

}
