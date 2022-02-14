package com.capgi.day11;
import java.io.FileWriter;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String str= "Hello";
		}
		FileWriter fileWriter= new FileWriter("");
		fileWriter.write(str);
		catch(Exception e){
			e.setStackTrace();
		}

	}

}
