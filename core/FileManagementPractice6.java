package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementPractice6 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream o=new FileOutputStream("input.txt");
		String s=("this is a input string");
		
		byte b[]=s.getBytes();
		o.write(b);
		o.flush();
		o.close();
		
		System.out.println("complete");
		
		FileInputStream p=new FileInputStream("input.txt");
		int i;
		while((i=p.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		p.close();
	}

}
