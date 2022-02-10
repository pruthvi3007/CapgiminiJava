package com.capgi.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ArrayListCollection {
	public static void main(String args[])
	{
//		creating array list
		ArrayList<String> list= new ArrayList<String>();
//		adding objects into array list
		list.add("Pruthvi");
		list.add("codes");
		list.add("in java");
		
		Iterator<String> it= list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//stack list
		Stack<String> st= new Stack<String>();
		st.push("This");
		st.push("is");
		st.push("Stack");
//		st.pop();
		
		Iterator<String> it1= st.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		
	}

}
