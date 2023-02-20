package com.bridgeLabz.basics;

public class Sample1 {
	public static void main(String[] args) {
		
	
		int [] arr = {1,2,3,4,5};
		System.out.println(arr);
		
	 // static variables or methods can be accessed through class name when we are outside the class
    System.out.println(VariableExample.x);
    VariableExample.m1(10);
    VariableExample.m2();

    VariableExample variablesExample1 = new VariableExample();
    System.out.println("before + "+variablesExample1.y); // 0
   
    variablesExample1.y = 40;
    variablesExample1.m3(50);
    System.out.println("after + "+variablesExample1.y); // 40
   
    VariableExample variablesExample2 = new VariableExample();
    System.out.println(variablesExample2.y); // 0
    variablesExample2.m3(60);
}

}
