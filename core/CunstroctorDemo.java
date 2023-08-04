package com.core;

//this program is a normal method program not a constructor but is works on constructor 

class Krishaweb 
{
	void qa()
	//void is a return type
	{
		System.out.println("This is Krishaweb QA ");
	}
	
	void tester()
	{
		System.out.println("This is Krishaweb Tester ");
	}
}

public class CunstroctorDemo {
	//public class is a main class of our program
	public static void main(String[] args) {
		
		//like scanner sc=new scanner(system.in);
		Krishaweb K1=new Krishaweb();
		K1.qa();
		
		Krishaweb K2=new Krishaweb();
		K2.tester();
		
	}

}
