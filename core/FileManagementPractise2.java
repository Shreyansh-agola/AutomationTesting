package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementPractise2 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream o=new FileOutputStream("dot.txt");
		String r=("this is my second file management");
		
		byte b[]=r.getBytes();
		o.write(b);
		o.flush();
		o.close();
		
		System.out.println("written");
		
		FileInputStream i=new FileInputStream("dot.txt");
		int n;
		while((n=i.read())!=-1)
		{
			System.out.print((char)n);
		}
		i.close();
	}

}
