package com.capgi.day3;

class MyShape
{
	public int draw(int a, int b)
	{
		System.out.println("Line");
		return 0;
	}
	public void draw(int a, int b,int c)
	{
		System.out.println("Circle");
	}
	public void draw(int a, int b,int c,int d)
	{
		System.out.println("Square");
	}
}

public class MyPolymorphismMethodOverloading {
	
	public static void main(String args[])
	{
		MyShape s=new MyShape();
		s.draw(1,2);
		s.draw(1,2,3);
		s.draw(1,2,4,5);
		
	}

}
