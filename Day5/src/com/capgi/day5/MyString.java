package com.capgi.day5;

public class MyString {
	public static void main(String args[]) {
		
		String str1 = new String("Pruthvi codes");
		String str2 = new String(" in java");
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.replaceAll(str1, str2));
		System.out.println(str1.getBytes());
		
	}
	
}