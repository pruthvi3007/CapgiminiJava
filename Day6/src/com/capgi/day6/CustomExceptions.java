package com.capgi.day6;
import java.util.*;

class OnlyPositiveNumAllowed extends Exception
{
	public OnlyPositiveNumAllowed(String msg)
	{
		super(msg);
	}
}
public class CustomExceptions {
	public static void main(String[] args) throws Exception
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
	
		if(num>0)
		{
//			even odd logic
		}
		else {
			throw new OnlyPositiveNumAllowed("only positive number allowed");
		}
	}

}
