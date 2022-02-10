package com.capgi.day4;
import java.util.Scanner;
class car{
	private String model;
	private String color;
	private int price;
	
	public car(){
		
	}
	
	public car(String model, String color, int price) {
		this.model=model;
		this.color=color;
		this.price=price;
		
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
public class CarData {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
//		input from user
		System.out.println("Enter Model: ");
		String model= new String(sc.nextLine());
		System.out.println("Enter Color: ");
		String color= new String(sc.nextLine());
		System.out.println("Enter Price: ");
		int price= new Integer(sc.nextInt());
//		Declared car1 as object
		car car1= new car();
//		setting parameters by  set method
//		user input directly goes into set method
		car1.setModel(model);
		car1.setColor(color);
		car1.setPrice(price);

//		printing user input by get method
		System.out.println("Model: "+car1.getModel());
		System.out.println("Color: "+car1.getColor());
		System.out.println("Price: "+car1.getPrice());
	}

}
