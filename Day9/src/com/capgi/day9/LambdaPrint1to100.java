package com.capgi.day9;
// program to print numbers from 1 to 100 using lambda expression
@FunctionalInterface
interface PrintNum {
	public void print();
}
public class LambdaPrint1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		 PrintNum num= () -> {
			 while(a<=100) {
				 System.out.println(a);
				 a++;
			 }
			
		 };
		 num.print();


		 
	}

}
