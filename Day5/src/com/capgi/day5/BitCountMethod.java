package com.capgi.day5;

public class BitCountMethod {

	public static void main(String args[]) {
		int p = 30;
		System.out.println("Entered Integer is:" + p);
		System.out.println("Binary Num:" + Integer.toBinaryString(p));

		System.out.println("Bit Count:" + Integer.bitCount(p));
	}

}
