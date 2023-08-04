package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementPractice3 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream s=new FileOutputStream("shre.txt");
		String g="this is my third file management";
		
		byte b[]=g.getBytes();
		s.write(b);
		s.flush();
		s.close();
		
		System.out.println("written");
		
		FileInputStream e=new FileInputStream("shre.txt");
		int i;
		
		while((i=e.read())!=-1)
		{
			System.out.print((char)i);
		}
		e.close();
	}

}
