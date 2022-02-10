package com.capgi.day5;

public class IntegerRotateLeftMethod {
	public static void main(String args[]) {
		int value = 12;
		int dist = 2;
		System.out.println("Binary value of" + value+" :" + Integer.toBinaryString(value));

		int rotate = Integer.rotateLeft(value, dist);

		System.out.println("Binary Rotated Value:" + rotate);

		System.out.println("Binary value after Rotated Left: " + Integer.toBinaryString(rotate));
	}

}
