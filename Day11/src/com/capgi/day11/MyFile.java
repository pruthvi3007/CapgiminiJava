package com.capgi.day11;
import java.io.FileWriter;

public class MyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str= new String(" Hello Pruthvi");
		
		FileWriter fileWriter= new FileWriter("E://abc.txt");
		char[] c= {'a','b','c'};
		fileWriter.write(c);
		fileWriter.write(str);
		fileWriter.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
