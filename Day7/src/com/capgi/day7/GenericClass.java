package com.capgi.day7;

class Employee<A, B, C> {
	private A name;
	private B id;
	private C salary;
	
public Employee(A name,B id,C salary)
{this.name=name;this.id=id;this.salary=salary;}
public void printEmployee()
{
	System.out.println("Name:"+ this.name);
	System.out.println("ID:"+ this.id);
	System.out.println("Salary:"+ this.salary);
}
}
public class GenericClass {

	public static void main(String args[])
	{
		
		// Wrapper class
	    // it will not take the primitive type
		//Generic class with paramters passing
		Employee<String, Float, Double> e1= new Employee<String, Float, Double>("Pruthvi", 53f, 101.0);
		e1.printEmployee();
		
		Employee<Integer, Float, Integer> e2= new Employee<Integer, Float, Integer>(22, 53f, 1);
		e2.printEmployee();
	}
}
