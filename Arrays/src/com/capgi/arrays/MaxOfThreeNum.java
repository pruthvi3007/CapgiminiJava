package com.capgi.arrays;

// find max of three numbers
import java.util.Scanner;

public class MaxOfThreeNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		declare variable
		int a = 3;
//		declaring size of array
		int[] arr = new int[a];
		System.out.println("Enter 3 numbers:");
//		init loop to take values from user
		for (int i = 0; i < arr.length; i++) {
//			put values from user into array
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 1; i < arr.length; i++) {
			int maxnum=arr[0];
			int minnum=arr[0];
			if (arr[i] > arr[0]) {
				maxnum=arr[i];
			}
			 if(arr[i]<arr[0]){
				 minnum=arr[i];
			}
				System.out.println("Max:"+maxnum);
				System.out.println("Min:"+ minnum);
				break;

		}
		
	}

}
