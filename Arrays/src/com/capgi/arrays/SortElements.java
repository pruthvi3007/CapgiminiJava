package com.capgi.arrays;

//sort the elements of array
import java.util.Scanner;

public class SortElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Enter elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
