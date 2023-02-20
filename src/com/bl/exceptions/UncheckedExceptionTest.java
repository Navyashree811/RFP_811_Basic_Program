package com.bl.exceptions;

//Run Time Exception or UnChecked Exception

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		
//		Compiler not show any exception at compile time and its exception occur at runtime 
//		so we can say that it is unchecked exception.
		
//		int a = 100, b = 0, c;
//		c = a/b;
//		System.out.println("Value of c is " + c);
		
//		String name = null;
//		System.out.println(name.length());

		
		try {
			int a = 100, b = 0, c;
			c = a/b;
			System.out.println("Value of c is " + c);
		}
		catch(ArithmeticException e) {
			System.out.println("You can not devided by zero ");
			System.out.println(e);
//			e.printStackTrace();   // print exception name and description
//			System.out.println(e.toString());  // print exception name and description
			e.getMessage();
		}
//		try {
//			String name = null;
//			System.out.println(name.length());
//
//		}
//		catch (NullPointerException e) {
//			System.out.println(e);
//		}
	}
}
