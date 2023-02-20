package com.bridgeLabz.basics;

public class VariableExample {
	
	 static int x = 40;  // 40

	    long y ; // 0

	// static method => class level method
	    static void m1(int c){

	        System.out.println("m1 method");
	        System.out.println("static x before = "+x); // 40
	        int y = 20;
	        System.out.println("x = "+y);
	        x = 50;
	        System.out.println("static x after = "+x); // 50
	        System.out.println("c = "+c);
	        m2();


	        VariableExample variablesExample = new VariableExample();
	        System.out.println(variablesExample.y);
	    }

	    static void m2(){
	        System.out.println("m2 method");
	        System.out.println("static x = "+x); // 0  // 50
//	        System.out.println(c);
//	        System.out.println(x);
	    }

	    void m3(int s){
	        int y = 20;
	        System.out.println("m3()");
	        System.out.println(s);
	        System.out.println(y);
	        System.out.println(this.y); // this keyword refers to the current object.
	        System.out.println(x);
	    }

	    public static void main(String[] args) {

	        System.out.println("Main method");
	        System.out.println(x); // 0
	        m2();
	        m1(50);
	        //m2();
	        System.out.println("After calling m1()");
	        System.out.println(x);   // 50
	        VariableExample variablesExample = new VariableExample();
	        System.out.println(variablesExample.y); // 0
	        variablesExample.y = 90;
	        variablesExample.m3(30);

	        // Object level things can access static level things directly
	        // Static level things cannot access object level things directly, we have to create object for that.


	    }

}


// Types of Variables
// Local , Instance , Static

// Types of Methods
// static and non-static


//Local Variable
// Local variables must be initialized. The initialization can take place inside a method or block and not directly inside a class.
// The scope of the local variable will be within a block or method.

//Static variable
// Static Variable must be declared directly inside a class but outside of any of the methods or blocks.
// Static Variable will be getting the memory when the class loading happens
// Static Variable must be declared using static keyword.
// There will be only one copy of that variable shared throughout the class.
// It is not mandatory to initialize a static variable.
// If I am not initializing the static variable then it will take default value according to the data type.
// static variables or methods can be accessed through class name when we are outside the class

//Instance variable
// Instance Variable must be declared directly inside a class but outside of any of the methods or blocks.
// Instance Variable will be getting the memory when the object is created
// There will be one copy of that variable at an object level
// If I create multiple objects , each object will have its own copy of the instance variable and these are not shared among the objects.
// It is not mandatory to initialize a instance variable.
// If I am not initializing the instance variable then it will take default value according to the data type.
// Instance variables or methods(non-static) can be accessed only through the object whether I am outside or inside the class.
// If I am inside a non-static method , I can directly access the instance variable.


