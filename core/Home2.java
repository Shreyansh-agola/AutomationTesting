package com.core;

import java.util.Scanner;

/*
 * School Admission Process
 * Student merit must be match as per requirement 
 * last year percentage must be <65
 */
public class Home2 {
	public static void main(String[] args) {
		int s1, s2, s3, total;
		double per;
		String sname, location;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Student Name :");
		sname=sc.next();
		System.out.print("Enter Candidate Location :");
		location=sc.next();
		System.out.print("Enter Marks of S1 :");
		s1=sc.nextInt();
		System.out.print("Enter Marks of S2 :");
		s2=sc.nextInt();
		System.out.print("Enter Marks of S3 :");
		s3=sc.nextInt();
		
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Candidate Name :"+sname);
		System.out.println("Candidate Total Marite : "+total);
		System.out.println("Candidate Percentage : "+per);
		
		if(total>250)
		{
			System.out.println("Candidate Is Excellent");
		}
		else if(total>200)
		{
			System.out.println("Candidate Is Good");
		}
		else if(total>150)
		{
			System.out.println("Candidate Is Avarage");
		}
		else
		{
			System.out.println("Candidate Is Not Able to Join The School Sorry");
		}
	}

}
