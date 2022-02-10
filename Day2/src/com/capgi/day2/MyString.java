package com.capgi.day2;
//write a program to take string array upto 10 elements
// read the 10 value from the user
//convert it in uppercase
// read 11th location o the array
import java.util.Scanner;
public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		int a = sc.nextInt();
		String [] arr= new String[10];
		
//		System.out.println("enter strings");
		for (int i=0;i<=10;i++) {
			System.out.println("enter the string"+ i);
			arr[i]= sc.nextLine();
			System.out.println(arr[i].toUpperCase());
		}
		sc.close();

		
	}

}
