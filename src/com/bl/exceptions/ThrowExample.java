package com.bl.exceptions;

import java.util.Scanner;

// throw keyword basically used for custom exception and user defined exception
// we can throw either checked or unchecked exception but throw is best for customized exception.
// we can only throw class that comes in throwable child class.
// throw : It create exception object manually (by programmer) and handover to JVM.



class YoungAgeExceptionEx extends RuntimeException {
	YoungAgeExceptionEx(String msg) {
		super(msg);
	}
}

public class ThrowExample {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
//		if(age<18) {
//			throw new  YoungAgeExceptionEx("You are not eligible to vote");
//		}
//		else {
//			System.out.println("Vote success");
//		}

		try {
			if (age < 18) {
				throw new YoungAgeExceptionEx("You are not eligible to voting");
//				System.out.println("Hiiii"); we cannot write any statement after throw statement , it will provide unreachable statement error error.
			} else {
				System.out.println("You can vote successfully");
			}

		} catch (YoungAgeExceptionEx e) {
			System.out.println(e);
//			e.printStackTrace();
		}

		System.out.println("Hello");
	}

}
