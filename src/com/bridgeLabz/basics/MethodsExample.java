package com.bridgeLabz.basics;


//JVM calls the main method
//Inside main method the execution will happen sequentially
import java.util.Scanner;


//Statements in java => Sequential , conditional , Repetative
public class MethodsExample {  
	
   // method definition or implementation
    static int m1(int c){
        System.out.println("m1");
        System.out.println(c);
        int sum = c + 40;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("main method");
        int i = 10;
        System.out.println(i);
        int sum = m1(i); // method call
        System.out.println("SUM => "+sum);
        System.out.println("main method ended");
        int s = m1(50);
        System.out.println(s);

        if(i == 10) {
            System.out.println("true");
            System.out.println("if block");
        }else
            System.out.println("false");

        int z =30;
        if(s == 90) {
            z = 10;
            System.out.println("true");
            System.out.println("if block");
        }
        else if(s > 90){
            System.out.println(z);
            System.out.println("s > 90");
        }else
            System.out.println("false");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter choice");
        int ch = scan.nextInt();

        switch (ch){
            case 1:
                System.out.println("case-1");
                break;
            case 2:
                System.out.println("case-2");
                break;
            case 3:
                System.out.println("case-3");
                break;
            default:
                System.out.println("This is default");
        }

        // Conditional Statements
        // if-else , Switch

        // Repetition Statements
        // Loops => for, while ,do-while
        int j;
        for(j=0;j<10;j++){
            int a = 30;
            System.out.print(j + " ");
        }
        System.out.println(j);

        int k=0;

        int sum1 = k++ + ++k + k++ ; //0 + 2 + 2
        System.out.println(++k);

        System.out.println(sum1);
        System.out.println("while");
        int x = 0;
        while(x<10){
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
        System.out.println("do-while");
        int y = 0;
        do{
            System.out.println(y);
            y++;
        }while(y<10);
    }

}
