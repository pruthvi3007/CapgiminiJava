package com.capgi.arrays;
// average of three number
import java.util.Scanner;
public class AvgOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size:");
		int a=sc.nextInt();
		
		int arr[]= new int[a];
		System.out.println("Enter numbers:");
//		taking values from user  into array
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		sc.close();
//		logical operation for avg
		float sum = 0;
		float avg;
		
		for(int i=0;i<arr.length;i++) {
			
		 sum = sum + arr[i] ;
		}
		 avg = sum/a ;

		System.out.println("Avg:"+ avg);

	}

}
