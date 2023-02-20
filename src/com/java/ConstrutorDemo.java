package com.java;

class Calc { 
	int num1;
	int num2;
	public Calc (int number1, int number2) {
		num1 = number1;
		num2 = number2;
	}
}

public class ConstrutorDemo {  
	public static void main(String[] args) {
		Calc obj = new Calc(4,8);
//		System.out.println(obj.num1);
//		System.out.println(obj.num2);
		System.out.println("num1 = " + obj.num1 + " , " + "num2 = " +  obj.num2);
	
	}

}
