package com.capgi.day8;
import java.util.*;

class StudentData{
	private String name;
	private String std;
	private int rollno;
	private float fees;
	private String housecolor;
	
	public StudentData (String name, String std, int rollno, float fees, String housecolor ) {
		super();
		this.name=name;
		this.std=std;
		this.rollno=rollno;
		this.fees=fees;
		this.housecolor=housecolor;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getHousecolor() {
		return housecolor;
	}

	public void setHousecolor(String housecolor) {
		this.housecolor = housecolor;
	}

	
}
public class StudentClass {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		StudentData[] student1 = {};
		
		System.out.println("Enter 1 to insert");
		System.out.println("Enter 2 to Delete");
		System.out.println("Enter 3 to update");
		System.out.println("Enter 4 to sort ASC");
		System.out.println("Enter 5 to DESC");
		System.out.println("Enter 6 to print the size");
		System.out.println("Enter 7 to exit");
	
		int choice =sc.nextInt();
		if(choice==1) {
			
			
			System.out.println("Enter Student name to insert:");
			
			student1= new StudentData[5];
			for(int i=0;i<5;i++) {
			System.out.println("Enter student "+ i);
			String	name= sc.nextLine();
			System.out.println("Enter student "+i);
			String	std= sc.nextLine();
			System.out.println("Enter student "+i);
			String	rollno= sc.nextLine();
			System.out.println("Enter student "+i);
			String	fees= sc.nextLine();
			System.out.println("Enter student "+i);
			String	housecolor= sc.nextLine();
			
			}
		}
		if(choice==2) {
			boolean infodelete = true;
			System.out.println("Enter student name to Delete:");
			String name =sc.nextLine();
			for(int i=0; i<student1.length;i++)
			{
				if(student1[i].getName()==name) {
					infodelete= false;
					System.out.println("Info Deleted:");
					break;
				}
			}
			
		}
		
//		3 to update use collection.sort
//		4 to sort asc use collection.sort and collection.reverseorder
	}

	 
}
