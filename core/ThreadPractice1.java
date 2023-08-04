package com.core;

public class ThreadPractice1 {
	public static void main(String[] args) {
		try
		{
		int a;
		for(a=0;a<5;a++)
		{
			System.out.println(a);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
