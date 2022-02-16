package com.capgi.arrays;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int a= sc.nextInt();
		int arr[]= new int[a];
		System.out.println("Enter elements: ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number to find: ");
		int num=sc.nextInt();
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num) {
				System.out.println("Number is present at position: "+i);
				break;
			}
		
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=num) {
				System.out.println("Number not found");
			}
		}
		
	}

}
