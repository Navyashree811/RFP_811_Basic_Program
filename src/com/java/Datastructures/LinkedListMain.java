package com.java.Datastructures;

public class LinkedListMain {

	public static void main(String[] args) {

		LinkedLists <Integer> list1 = new LinkedLists();
		list1.push(70);
		list1.push(30);
		list1.push(56);
		list1.add(46);
		list1.show();

		System.out.println();

		LinkedLists<Integer> list2 = new LinkedLists<>();
		list2.add(56);
		list2.add(30);
		list2.add(70);
		list2.push(46);
		list2.show();
	}
}
