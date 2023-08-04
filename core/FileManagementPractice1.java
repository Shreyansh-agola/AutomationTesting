package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementPractice1 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fops=new FileOutputStream("firstfile.txt");
		String t="hy this is my first file management";
		
		byte b[]=t.getBytes();
		fops.write(b);
		fops.flush();
		fops.close();
		
		System.out.println("write sucessfully");
		
		FileInputStream fips=new FileInputStream("firstfile.txt");
		int i;
		while((i=fips.read())!=-1)
		{
			System.out.print((char)i);
		}
		fips.close();
	}

}
