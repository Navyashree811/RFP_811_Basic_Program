package com.bridgeLabz.basics;

public class MainClass1 {  
	
	void m1() {
		
	}
	public static void main(String[] args) {
		String str = "ABC";
		byte b = 10;                    // 1 byte // -128 to 127 // 0
		short s = 20;                  // 2 byte // 0
		int i = 30;                   // 4 byte // 0
		long l = 50;                 // 8 byte // 0
		float f = 383289829.889f;   // 4 byte //0.0f
		double d = 200020.9929;    // 8 byte //0.0
		boolean b1 = true;        // 1 bit // false
		char c = '3';            // 2 byte // \u0000   
		int ch2 = 'a';
		int ch1 = '6';
		System.out.println(ch1  + "...." + ch2);
		
	}

}

// byte	--> 1 byte	Stores whole numbers from -128 to 127
//short --> 2 bytes	Stores whole numbers from -32,768 to 32,767
//int -->   4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long -->	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float -->	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double --> 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//boolean --> 1 bit	Stores true or false values
//char --> 2 bytes	Stores a single character/letter or ASCII values


//JVM calls the main method from where our code starts executing.
//JVM has main thread responsible for calling the main method.
//One source file(.java file) can contain only one public class.

//Data types => Primtive and Non-Primitive
//Primitive => 8 data types->  byte short int long float double char boolean
//Non-Primitive => Arrays,Class,Interface,Enum
//Non-primitve data type can only hold the objects

//Naming Conventions =>
//Class ,Interface ,Enum => Pascal case => First letter will be upper case and if there is another word it starts with upper case
//Eg:- EmployeeWage

//Methods , variables => Camel Case => First letter lower case and if there is another word it starts with upper case
//Eg:- calculateWage() , diceCount

//Constant => All upper case with underscores between words
//Eg:- TOTAL_WORKING_HOURS

