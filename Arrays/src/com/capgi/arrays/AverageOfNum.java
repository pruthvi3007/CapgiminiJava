package com.capgi.arrays;

//program to calculate average of numbers
import java.util.Scanner;

public class AverageOfNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array count:");
		int a = sc.nextInt();

		int[] arr = new int[a];
		System.out.println("Enter elements:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		float b = arr.length;
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		float Percent = sum / b;
		System.out.println("Average value: " + Percent);

	}

}
