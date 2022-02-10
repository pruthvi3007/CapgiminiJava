package com.capgi.strings;

//Check wheather the string is palindrome or not
import java.util.Scanner;

public class StringPalindrome {
	public static void main(String args[]) {
		String str, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		str = sc.nextLine();

		int len = str.length();
		for (int i = len - 1; i >= 0; i++) {
			rev = rev + str.charAt(i);

			if (str.equals(rev)) {
				System.out.println(str + "this is palindrome string");

			}

			else {
				System.out.println(str + "this is not palindrome string");
			}
		}
	}

}
