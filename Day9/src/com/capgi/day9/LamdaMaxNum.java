package com.capgi.day9;
// program to find max num using lambda exp
@FunctionalInterface
interface MaxNum{
	public int findmax(int a,int b);
}
@FunctionalInterface
interface MinNumber{
	public  int minvalue(int c,int d);
	}
public class LamdaMaxNum {
	public static void main(String args[]) {
//		max num print
		MaxNum num = (a,b) -> {
			if(a>b) {
				return a;
			}
			else {
				return b;
			}
		};
		
		System.out.println("Max is : "+num.findmax(23, 32));
		
//		min num print
		
		MinNumber numbers= (c,d) -> {
			if(c<d) {
				return c;
			}
			else {
				return d;
			}
		};
		System.out.println("Min is :"+ numbers.minvalue(2345, 451));
	}

}
