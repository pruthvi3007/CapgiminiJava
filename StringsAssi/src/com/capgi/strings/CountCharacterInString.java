package com.capgi.strings;

//Count the occurence of given character from the string
public class CountCharacterInString {

	public static void main(String args[]) {
//		declare string
		String str = "pruthvi";
		char search = 'h';
//count from start
		int count = 0;
//		apply loop to whole string
		for (int i = 0; i < str.length(); i++) {
//			use charAt to find the character
			if (str.charAt(i) == search) {
				count++;
			}
		}

		System.out.println("The Character " + search + " appears " + count + " times");
	}

}
