package com.bl.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamApi {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(25);

//		Predicate<Integer> predicate = (x) -> x % 2 == 0;

//	List<Integer>list2 = list.stream().filter(predicate).collect(Collectors.toList());
		List<Integer> list2 = list.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList());

		System.out.println(list2);

		List<Integer> list3 = list.stream().map(x -> x * 5).collect(Collectors.toList());
		System.out.println(list3);

		List<Integer> list4 = list.stream().filter((x) -> x % 2 == 0).map(x -> x * 5).collect(Collectors.toList());
		System.out.println(list4);
		
	    list.stream().filter((x) -> x % 2 == 0).map(x -> x * 5).forEach(x -> System.out.println(x));
		
	    System.out.println("Result => " + list.stream().reduce(1,(x,y) -> x * y));
	    
	Integer res = list.stream().filter((x) -> (x % 2 == 0)).map(y -> y * 5).reduce(1,(v,w) -> v * w); //even number
	System.out.println("Result => " + res);
	
	Integer res2 = list.stream().filter((x) -> !(x % 2 == 0)).map(y -> y * 5).reduce(1,(v,w) -> v * w);  // odd number
	    System.out.println("Result => " + res2);
	    
	    Comparator<Integer> com = new ComparatorSample<>();
	    	    
	    list.stream().sorted().forEach(x -> System.out.println(x));
	    
	}

}
