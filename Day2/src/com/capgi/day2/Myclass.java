package com.capgi.day2;
//house
//design --where is main gate
//lobby
//liviing 



//take paper and create same type of house (any number)



//Java artch



class Phone {



  // attributes
  // member variable
  // heap memory
  private int price; // 0
  private String brandName; // null
  private String color; // null
  private int storage; // 0
  private float screenSize; // 0.0



//default Constructor 
//it is special method
//it has the same name as class 
//default method(does not have any parameters and no return values)
//if default method is not created by us then java will create and use it
  Phone() {



  }



//paramters Constructor



//this keyword belong to class variable
  Phone(int price, String brandName, String color, int storage, float screenSize) {
      this.price = price;
      this.brandName = brandName;
      this.color = color;
      this.storage = storage;
      this.screenSize = screenSize;
  }



//setter method for price
  public void setPrice(int price) {
      this.price = price;
  }



  public void setBrandName(String brandName) {
      this.brandName = brandName;
  }



  public void setColor(String color) {
      this.color = color;



  }



  public void setStroage(int storage) {
      this.storage = storage;



  }



  public void setScreenSize(float screenSize) {
      this.screenSize = screenSize;
  }



//getter method to get the values
  public float getSceenSize() {
      return this.screenSize;
  }



  public int getPrice() {
      return this.price;
  }



  public String getBrandName() {
      return this.brandName;
  }



  public String getColor() {
      return this.color;



  }



  public int getStroage() {
      return this.storage;



  }



//Constructor overloading 
//overloading --where we have method with same name but different parameters 



//to store the value
//constructor
//setter method (Setting the value)



//method
//get the value
//we call getter 
//print the value of all the variable (toString)



//print method
//printing all the value 
  public void printDetails() {
      System.out.println("Brand " + this.brandName);
      System.out.println("Price " + this.price);
      System.out.println("Color " + this.color);
      System.out.println("Storage " + this.storage);
      System.out.println("Screen Size " + this.screenSize);
  }



//method
//have business
//needs to find the phone with particular brands



}



public class Myclass {



  public static void main(String args[]) {



      // Constructor to set the member variables
      Phone phone1 = new Phone(10000, "Nokia", "grey", 64, 5.5f);
      phone1.printDetails();
      // phone1.price=100;
      // Setter method to set the value
      Phone phone2 = new Phone();
      phone2.setBrandName("Sumnung");
      phone2.setColor("Green");
      phone2.setPrice(5000);
      phone2.setStroage(32);
      phone2.setScreenSize(4.0f);
      // phone2.printDetails();



      // using getter method printing the values
      System.out.println("BrandName " + phone2.getBrandName());
      System.out.println("Color " + phone2.getColor());
      System.out.println("Price " + phone2.getPrice());
      System.out.println(" Storage " + phone2.getStroage());
      System.out.println("Screen Size " + phone2.getSceenSize());



  }



}
