package com.capgi.arrays;
// sum of all elements 
import java.util.Scanner;
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of values:");
		int b = sc.nextInt();
		int[] num = new int[b];
		System.out.println("Enter values:");

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		
		// sum of array numbers
		int sum=0;
		for(int i=0;i<num.length;i++) {
			
			 sum = sum+ num[i];
		}
		System.out.println("Sum:"+ sum);

	}

}
