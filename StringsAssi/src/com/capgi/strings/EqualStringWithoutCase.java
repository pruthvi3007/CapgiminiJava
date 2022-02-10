package com.capgi.strings;

//Check if two strings are the same ignoring their cases.
import java.util.*;

public class EqualStringWithoutCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		input from user
		System.out.println("Enter String1:");
		String str1 = new String(sc.nextLine());
		System.out.println("Enter String2:");
		String str2 = new String(sc.nextLine());
//		using equalsignorecase method as logic
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Strings are equal ignoring their case");
		} else {
			System.out.println("Strings are not equal");

		}

	}
}
