package com.capgi.strings;

//program to reverse the string characters
import java.util.*;
public class ReverseStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		input from user
		System.out.println("Entre a String:");
		String str = sc.nextLine();
		int len = str.length();
		// String str is immutable string
		System.out.print("Input string :\n" + str);

		StringBuffer str1 = new StringBuffer(str); 
		// Buffer  is mutable string 

		System.out.print("\nReversed string : ");
		System.out.println(str1.reverse()); 

	}
}