package com.core;

class student1
{
	String firstname, lastname;
	
	student1()
	{
		System.out.println("Student Default Constructor");
	}
	
	student1(String firstname, String lastname)
	{
		this();
		this.firstname=firstname;
		this.lastname=lastname;
	}
	
	void show()
	{
		System.out.println("First Name : "+firstname);
		System.out.println("Last Name : "+lastname);
	}
}
public class ThisKeywordPractice1 {
	public static void main(String[] args) {
	
		student1 s2=new student1("Shreyansh", "Agola");
		s2.show();
	}
}
