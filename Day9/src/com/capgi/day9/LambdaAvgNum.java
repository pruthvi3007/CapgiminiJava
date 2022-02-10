package com.capgi.day9;

interface AverageNumber{
	public void average(int a,int b);
}
public class LambdaAvgNum {
	public static void main(String args[]) {
		AverageNumber avg = (n1,n2) -> {
			int c = (n1+n2)/2 ;
			System.out.println(c);
		};
		avg.average(10, 20);
	}

}
