package com.capgi.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		array strings

//		System.out.println("Enter number of strings:");
//		int a = sc.nextInt();
//		String str[] = new String[a];
//		for (int i = 0; i <a; i++) {
//			str[i] = sc.nextLine();
////			System.out.println("Entered strings are:" + str[i]);
//		}
//		for(int i=0;i<a;i++) {
//		System.out.println("Entered strings are:"+ str[i]);
//		}
//		number arrray
		System.out.println("Enter number of values:");
		int b = sc.nextInt();
		int[] num = new int[b];
		System.out.println("Enter values:");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Entered Values");
		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);
		}
		// sum of array numbers
		int sum=0;
		for(int i=0;i<num.length;i++) {
			
			 sum = sum+ num[i];
		}
		System.out.println("Sum:"+ sum);
		

	}

}
