package com.capgi.day5;


public class MyString {
	public static void main(String args[]) {
		
		String str1 = new String("Hello");
		String str2 = new String();
	
		System.out.println(str1.concat(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.replaceAll(str1, str2));
		System.out.println(str1.getBytes());
		
	}
	
}