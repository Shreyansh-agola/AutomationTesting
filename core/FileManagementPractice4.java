package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementPractice4 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream x=new FileOutputStream("shrey.txt");
		String c=("this is my fourth file management");
		
		byte b[]=c.getBytes();
		x.write(b);
		x.flush();
		x.close();
		
		System.out.println("written");
		
		FileInputStream q=new FileInputStream("shrey.txt");
		int i;
		
		while((i=q.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		q.close();
		
	}

}
