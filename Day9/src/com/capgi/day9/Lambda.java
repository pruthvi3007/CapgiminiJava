package com.capgi.day9;

@FunctionalInterface
interface PosNeg
{
	public String value(int a);
}
@FunctionalInterface
interface StringLen{
	public int result(String s);
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Lambda exp to find whether the num is positive or negative
		PosNeg num =a->{
			if(a>0) {
				return a+": is Positive";
			}
			else {
				return a+": is negative";
			}
		};
		String str= num.value(30);
		System.out.println(str);
		
//		Lambda exp to find whether the num is positive or negative

		StringLen length = s -> s.length();
		System.out.println(length.result("Pruthvi"));

	}
//	public static String posneg(int a) {
//		if(a>0) {
//			return "Positive"+a;
//		}
//		else {
//			return "negative"+a;
//		}
//		
//	}

}
