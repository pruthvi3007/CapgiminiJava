package com.capgi.day9;
//lambda expression with combine two string
@FunctionalInterface
interface StringConcat{
	public String CombinedString( String str1, String str2);
}

public class LambdaStringConcat {
	public static void main(String args[]) {
	
	
//	lambda expression
	StringConcat combinedstring = (str1,str2) -> str1.concat(str2);
		System.out.println(combinedstring.CombinedString("pruthvi ","codes in java"));
	
	
		
	}	
	
}
