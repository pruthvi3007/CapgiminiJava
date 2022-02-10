package com.capgi.day5;

public class StringBufferandBuilder {
	
	public static void main(String args[])
	{
		StringBuffer sbf= new StringBuffer("hello");
		sbf.append("java");
		System.out.println(sbf);
		
		sbf.delete(3,5);
		System.out.println(sbf);
		
		StringBuilder sb = new StringBuilder("hello java");
		System.out.println(sb);
	}

}
