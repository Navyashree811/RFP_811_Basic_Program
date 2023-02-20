// Checked -> Exceptions which are checked by the compiler. I have to handle those exceptions before running my code
// 2 ways of handling checked exception - try-catch block and throws keyword

// Unchecked -> Exceptions which are occurring at run-time.
// 1 way of handling Unchecked exception - try-catch block

// Checked and Unchecked Exceptions
//                                       Throwable

//               Exception                                                    Error
// RuntimeException   IOException      Interrupted....              VMError LinkageError AssertionError...
// StackOverflow      // EOFException
// OutofMemoryError   // FileNotFoundException
// Unchecked
// AE
// NPE
// CCE
// IndexOutofBoundException
// AIOOBE
// SIOOBE
// IllegalArgumentException
// NumberFormatException

package com.bl.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	private static void methodA() throws FileNotFoundException, InterruptedException {

		// Its a good practice to handle exactly that exception which is thrown from a
		// try block.
		// Its not a good practice to handle using the parent exception class.
		FileReader fileReader = new FileReader(
				"D:\\manu\\New folder (2)\\PerfiosLaptopData\\newfolder1\\RFPSample169\\src\\com\\bridgelaz\\exceptions\\abc.txt");
		Thread.sleep(1000);
	}

	public static void main(String[] args) {

		// Throwable
//         Exception
//         Error

		try {
			methodA();
		} catch (FileNotFoundException e) {
			System.out.println("catch block " + e);
		} catch (InterruptedException e) {
			System.out.println("catch block " + e);
		}

		P7 obj = new P7();
		try {
			obj.m1();
		} catch (FileNotFoundException e) {
			System.out.println("catch block " + e);
		}
		int x = 10;
		System.out.println("main method start");

//        System.out.println(args[7]);
		try {
			float division = x / 0; // abnormal termination
		} catch (Exception e) {

			System.out.println("catch block " + e);
		}
		System.out.println("main method end");
	}

}
