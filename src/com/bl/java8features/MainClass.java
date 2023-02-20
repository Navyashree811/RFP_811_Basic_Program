package com.bl.java8features;

// Java-8 features
// Interface - default and static methods
// Functional Interface
// Lambda expression
//  Method references
// Java -8 streams API

@FunctionalInterface

interface IMathFunction {
	
	int calculate(int x, int y); 

	default void defaultMethod() {
		System.out.println("default method");
	}
	static void staticMethod(int x, int y, String function, IMathFunction ref) {
		System.out.println(function + " of " + x + " & " + y + " is =>  " + ref.calculate(x, y) );
	}
	
}

//class Sum implements IMathFunction {
//
//	@Override
//	public int calculate(int x, int y) {
//
//		return x+y;
//	}
//	
//}
//class Multiply implements IMathFunction {
//
//	@Override
//	public int calculate(int x, int y) {
//		return x*y;
//	}
//	
//}

public class MainClass { 
	public static void main(String[] args) {
//		
//		IMathFunction cal = new Sum();
//		System.out.println("sum = " + cal.calculate(6, 13));
//		IMathFunction cal1 = new Multiply();
//		System.out.println("product = " + cal1.calculate(6, 13));
		
//		IMathFunction sum = Integer::sum;
//		System.out.println("sum = " + sum.calculate(6, 13));
				
		IMathFunction sum = (a, b) -> a+b;
		System.out.println("sum = " + sum.calculate(6, 13));
		IMathFunction multiply = (a, b) -> a * b;
		System.out.println("product = " + multiply.calculate(13, 6));
		IMathFunction divide = (a, b) -> a / b;
		System.out.println("divisibal = " + divide.calculate(13, 6));
		IMathFunction sub = (a, b) -> a - b;
		System.out.println("substaction = " + sub.calculate(13, 6));
		
		IMathFunction.staticMethod(6, 13, "product", multiply);
		IMathFunction.staticMethod(6, 13, "sum", sum);
		IMathFunction.staticMethod(6, 13, "division", divide);
		IMathFunction.staticMethod(6, 13, "substaction", sub);
	}

}
