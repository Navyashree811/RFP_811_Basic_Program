package com.bl.java8features;

import java.util.Comparator;

public class ComparatorSample  <T extends Comparable> implements Comparator<T> {  
	
	@Override
	public int compare(T o1, T o2) {
		return (-o1.compareTo(o2));
	}

}
