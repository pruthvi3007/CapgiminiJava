package com.capgi.strings;
//check if two strings are anagrams of each other
import java.util.Arrays;
import java.util.*;
public class Anagrams {
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
//		input from user
		System.out.println("Enter Str1:");
		String str1= sc.nextLine();
		System.out.println("Enter Str2:");
		String str2 = sc.nextLine();
//		lower case each string
		str1= str1.toLowerCase();
		str2= str2.toLowerCase();
//		check if same length
		if( str1.length() == str2.length())
		{
			char[] carray1= str1.toCharArray();
			char[] carray2= str2.toCharArray();
			
			Arrays.parallelSort(carray1);
			Arrays.parallelSort(carray2);
//			if sorted arrays are same then anagram
			boolean result = Arrays.equals(carray1, carray2);
			if(result)
			{
				System.out.println(str1+ " and "+ str2+ " are anagram");
			}
			else {
				System.out.println(str1+ " and "+ str2+ " are not anagram");
			}
		 
			
		}
		
		else {
			System.out.println(str1+ " and "+ str2+ " are not anagram");
		}
	}

}
