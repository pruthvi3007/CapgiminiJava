package com.capgi.day10;

//static method
//default method in java 1.8
interface TestInterface {
	abstract public void test();

	default public void show() {
		System.out.println("default method");
	}

	default public void print() {
		System.out.println("default method print");
	}

	static public void showPrint() {

	}
}

class TestClass implements TestInterface {

	@Override
	public void test() {
		System.out.println("Abstract method");
	}
}

public class MyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass test1 = new TestClass();
		test1.test();
		test1.show();
		test1.print();

		TestInterface interface1 = new TestInterface() {
			@Override
			public void test() {
				System.out.println("class");
			}
		};
		interface1.show();
		interface1.test();
//		call the method
		TestInterface.showPrint();

	}

}
