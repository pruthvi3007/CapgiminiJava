package com.capgi.day2;

class Pen {
	private String color;
	private int price;
	private String brand;

	Pen() {

	}

	Pen(String color, int price, String brand) {
		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	public void printDetails() {
		System.out.println("color " + this.color);
		System.out.println("Price " + this.price);
		System.out.println("brand " + this.brand);

	}

	// Get and Set method syntax
	public void setcolor(String color) {
		this.color = color;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public String getcolor() {
		return this.color;
	}

	public int getprice() {
		return this.price;
	}

	public String brand() {
		return this.brand;
	}

}

public class Classpractice {

	public static void main(String args[]) {

		// by normal method
		Pen pen1 = new Pen("red", 10, "cello");
		pen1.printDetails();

		// by get and set method
		Pen pen2 = new Pen();
		pen2.setcolor("black");
		pen2.setprice(50);
		pen2.setbrand("reynolds");

		System.out.println("color: " + pen2.getcolor());
		System.out.println("price: " + pen2.getprice());
		System.out.println("brand: " + pen2.brand());

		Pen pen3 = new Pen();
		pen3.setcolor("green");
		pen3.setprice(20);
		pen3.setbrand("pentel");

		System.out.println("color: " + pen3.getcolor());
		System.out.println("price: " + pen3.getprice());
		System.out.println("brand: " + pen3.brand());
	}

}
