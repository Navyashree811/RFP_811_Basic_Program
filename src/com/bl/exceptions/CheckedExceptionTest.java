package com.bl.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Compile Time Exception or Checked Exception

public class CheckedExceptionTest {
	public static void main(String[] args) {

//		FileInputStream fis = new FileInputStream("c:/abc.txt"); //FileNotFoundException --> compileTimeException show
//      Class.forName("com.mysql.jdbc.Driver"); //ClassNotFoundException occur --> show compileTime
		
		try {
			FileInputStream fis = new FileInputStream("c:/abc.txt");
		} catch (FileNotFoundException es) {
			System.out.println("Ecception occur : " + es);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
