package com.capgi.day3;

//this is super class/ parent class
class A
{
	public int a=10;
	public void printA() 
	{
		System.out.println("This is Class A");
		
	}
}
// class keyword extends class keyword name
// this is child class/ sub class
class B extends A
{
	public int b=20;
	public void printB()
	{
		System.out.println("This is Class B");
		
	}
}
public class MyInheritance {
	public static void main(String args[]) {
		B b=new B();
		b.printB();
		b.printA();
		System.out.println("This is Class B"+b.a);
	}
}