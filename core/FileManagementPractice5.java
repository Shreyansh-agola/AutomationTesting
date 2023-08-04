package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementPractice5 {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream k=new FileOutputStream("Krishaweb.txt");
		String s=("this is krishaweb qa learning automation");
		
		byte b[]=s.getBytes();
		k.write(b);
		k.flush();
		k.close();
		
		System.out.println("written sucessfully");
		
		FileInputStream j=new FileInputStream("krishaweb.txt");
		int i;
		while((i=j.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		j.close();
	}

}
