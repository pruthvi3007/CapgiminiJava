package com.capgi.strings;

//Swaping of 2 strings

public class SwapingStrings {
	public static void main(String args[])
	{
		String str1 = new String("Black");
		String str2 = new String("Ranger");
		System.out.println("Before Swapping:"+ str1 + str2);
		str1= str1+str2;
		str2= str1.substring(0, (str1.length()-str2.length()));
		str1= str1.substring(str2.length());
		
		System.out.println("After Swapping:"+ str1 + str2);
	}

}
