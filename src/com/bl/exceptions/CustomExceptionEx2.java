package com.bl.exceptions;

// Coustom Exception Example for Unchecked exception
// If you create a Custom Exception --> Unchecked exception then you can write extends RuntimeException . 

class UnderAgeExceptions extends RuntimeException {
	UnderAgeExceptions() {
		super("You are Under Age");
	}

	UnderAgeExceptions(String message) {
		super(message);
	}

}

public class CustomExceptionEx2 {
	public static void main(String[] args) {
		int age = 17;
		if (age < 18) {
			throw new UnderAgeExceptions();
		}
		else {
			System.out.println("You can vote now ....!!");
		}
		
//		try {
//			if (age < 18) {
//				throw new UnderAgeExceptions();
//			}
//		else {
//			System.out.println("You can vote now ...!!");
//		}
//		} catch (UnderAgeExceptions e) {
//			e.printStackTrace();
//		}
	}

}
