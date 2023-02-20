package com.bridgeLabz.basics;

import java.util.HashMap;
import java.util.Map;

public class HasMapUseObjectKeyDemo {
	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Sam");
		Employee emp2 = new Employee(102, "Tom");
		Employee emp3 = new Employee(103, "Adam");

		HashMap<Employee, String> empHashMap = new HashMap();
		empHashMap.put(emp1, "User1");
		empHashMap.put(emp2, "User2");
		empHashMap.put(emp3, "User3");
		
		//System.out.println(empHashMap.get(emp3));

		for (Map.Entry<Employee, String> entry : empHashMap.entrySet()) {
			System.out.println(entry.getKey() + " === " + entry.getValue());
		}

	} 

}
