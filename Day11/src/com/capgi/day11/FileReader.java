package com.capgi.day11;

import java.util.Scanner;
import  java.io.File;

public class FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("abcd.txt");
			System.out.println("File name: "+file.getName());
			System.out.println("File absolute path: "+ file.getAbsolutePath());
		    System.out.println("Read: "+ file.canRead());
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String data= sc.nextLine();
			System.out.println(data);
		}
				sc.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
