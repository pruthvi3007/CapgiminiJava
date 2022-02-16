package com.capgi.arrays;

//print duplicate value n array
import java.util.Scanner;

public class PrintDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
					count++;
				}
			}

		}
		if (count == 0) {
			System.out.println("No duplicate element found");
		}

	}

}
