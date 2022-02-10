package com.capgi.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.IntSummaryStatistics;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		collecting data through generic class
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(15);
		ls.add(45);
		ls.add(9);
		ls.add(0);
		ls.add(100);
		System.out.println(ls.size());
		System.out.println(ls);
	
		
//		generic type , stream declare
		Stream s = ls.stream();
//		print each value inside list
		ls.stream().forEach(System.out::println);
//		s.forEach(System.err::println);

//		filter value using logical operator like <,>,.etc
		ls.stream().filter(num-> num>=10).forEach(System.out::println);
//		processing stream data	using filter
//		collection of required numbers using filter
		List<Integer> filterList = ls.stream().filter(num-> num>2).collect(Collectors.toList());
//		collection method reads all data and returns to list
		long count = ls.stream().count();
		
//		we can modify data using map, through true , false logic
		ls.stream().map(list-> list*10).forEach(System.err::println);
		
		System.out.println("max"+ ls.stream().min(Collections.reverseOrder()));

		IntSummaryStatistics state = ls.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("count "+ state.getCount());
		System.out.println("average "+ state.getAverage());
		System.out.println("sum "+ state.getSum());
		System.out.println("max "+ state.getMax());
	}

}
