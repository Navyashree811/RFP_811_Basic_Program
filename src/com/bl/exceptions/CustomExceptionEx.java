package com.bl.exceptions;

//custom exception example for checked exception 
// If you create a Custom Exception --> Checked exception then you can write extends Exception . 

class UnderAgeException extends Exception {
	UnderAgeException() {
		super("You are Under Age");
	}

	UnderAgeException(String message) {
		super(message);
	}

}

public class CustomExceptionEx {
	public static void main(String[] args) throws UnderAgeException {

// In case of checked exception we can use either try-catch or throws keyword.
// In case of unchecked exception we can use throw keyword.		

		// If we not use the try- catch for handle the exception then we can throws
		// keyword use with method signature and give Exception name.
		int age = 17;

		if (age < 18) {
			throw new UnderAgeException();
//			throw new UnderAgeException("You cannot vote as your age is below 18");
		}
		else {
			System.out.println("You can vote now ...!!");
		}

//		try {
//			if (age < 18) {
//				throw new UnderAgeException();
//			}
//		else {
//			System.out.println("You can vote now ...!!");
//		}
//		} catch (UnderAgeException e) {
//			e.printStackTrace();
//		}
	}

}
