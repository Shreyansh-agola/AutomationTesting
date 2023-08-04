package com.core;

class student 
{
	int rno;
	String sname; 
	
	student()
	{
		System.out.println("Student Default Constructor");
	}
	
    student(int rno, String sname)
	{
		//to call default constructor 
		this();
		this.rno=rno;
		this.sname=sname;
	}
	
	void show()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
	}
}
public class ThisKeywordDemo {
	
	public static void main(String[] args) {
		
		//parameterized construcor to call thavano j che so 
		student s1=new student(1,"Shreyansh");
		s1.show();
		
		
	}

}
