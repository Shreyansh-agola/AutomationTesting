package com.core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagementDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos=new FileOutputStream("tops1.txt");
		String s="This is file output/input demo using Java.";
		//string write direct na thay only byte code ma thay
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		//pipe ma data haji padyuo hoy next time ee data bija program ma na jay eetle flush
		fos.close();
		//file close kari
		
		System.out.println("File Written Sucessfully");
		
		FileInputStream fis=new FileInputStream("tops1.txt");
		//file read machine code asky value ma thay eetle int lidho
		int i;
		while((i=fis.read())!=-1)
		//!= eetle not equle to file na statement pati gaya so -1 return karshe
		{
			System.out.print((char)i);
		}
		fis.close();
		
	}

}
