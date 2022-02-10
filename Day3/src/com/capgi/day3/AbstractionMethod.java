package com.capgi.day3;

abstract class Mobile {
	final int price = 1000;

	// abstract method
	abstract public void calling();

	abstract public void sendSMS();

//	non abstract method
	public void chargingUSB() {
		System.out.println("USB charging");

	}

}

class Google extends Mobile {
	@Override
	public void calling() {
		System.out.println("Google 4g calling");

	}

	public void sendSMS() {
		System.out.println("send sms using internet");
	}

	public void Android() {
		System.out.println("Android Phone");
	}

}


class Apple extends Mobile
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("iMessage");
	}
	
	public void IOS()
	{
		System.out.println("IOS Apple");
	}
	public void getProcessor()
	{
		System.out.println("I am A7 chip");
	}
}


public class AbstractionMethod {

	
	public static void main(String args[])
	{
	Google gPlus=new Google();
	gPlus.Android();
	gPlus.calling();
	gPlus.sendSMS();
	gPlus.chargingUSB();
	
	
	
	//Apple 
	Apple plus12=new Apple();
	
	plus12.calling();
	plus12.sendSMS();
	plus12.getProcessor();
	plus12.IOS();
	plus12.chargingUSB();
	}
	
}