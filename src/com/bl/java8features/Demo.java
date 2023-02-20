package com.bl.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	    public static void main(String[] args) {
	        List<Integer> myList = new ArrayList<>();
	        myList.add(13);
	        myList.add(12);
	        myList.add(2);
	        myList.add(21);
	        myList.add(5);
	        myList.add(6);
	        myList.add(15);
	        myList.add(14);
	        myList.add(8);
	        myList.add(7);
	        myList.add(20);
	        List<Integer> list1= myList.stream().filter(x -> x%2 == 0).map(x -> x*2).sorted((x,y)-> -x.compareTo(y)).collect(Collectors.toList());
	        System.out.println(list1);
	        }
	    }

