package com.core;

public class ThreadDemo {
	public static void main(String[] args) {
		
		//thread method na consept che aa rite use thai sake one by one execute karvanu
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(3);
		System.out.println(t);
		
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				//main to aaj che Thread.sleep method ke je aapnne dhime dhime script run karave
				//thread method already exception throws kare so eene try catch ma lakhvu pade
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
