package com.core;

import java.util.Scanner;

public class ArrayElementInAsseAndDese {
	public class ArrayDemo {
		
		public static void main(String[] args) {
			
			int a[]=new int[5];
			int i,j,temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array Elements");
			
			for(i=0;i<a.length;i++)
			{
				System.out.print("Enter "+i+"Elements : ");
				a[i]=sc.nextInt();
			}
			
			System.out.println("Array Elements Are");
			
			for(i=0;i<a.length;i++)
			{
				System.out.println("A["+i+"] = "+a[i]);
			}
			
			//assending start with here
			for(i=0;i<a.length;i++)
			{
				System.out.println("A["+i+"] = "+a[i]);
			}
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Array Element Are In Assending Order");
			
			
			for(i=0;i<a.length;i++)
			{
				System.out.println("A["+i+"] = "+a[i]);
			}	
			for(j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Array Element Are In DeAssending Order");
			
			for(i=0;i<a.length;i++)
			{
				System.out.println("A["+i+"] = "+a[i]);	
				
			}

	}


}
