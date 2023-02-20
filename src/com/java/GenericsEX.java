package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Generic will always works for only non-primitives
public class GenericsEX<E,R> {
// Class level generic will only work for non-static variables and methods
    E var1;

    R var2;
//    static E var2;

    // Method level generics
    // can be applied over both static as well as non-static methods
    static <T,K>T[] displayArray(T[] array,K var){
        for (T x : array) {
            System.out.print(x + " ");
        }
        System.out.println(var);
        System.out.println();
        return array;
    }

    <T>void show(T x,E y){
        System.out.println(x);
        System.out.println(y);
    }


    R calculator(E var){
        System.out.println(var);
        R x = null;
        return x;
    }


//
//    static void displayIntArray(int[] intArray) {
//        for (int x : intArray) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//
//    static void displayCharArray(char[] charArray) {
//        for (char x : charArray) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }
//
//    static void displayFloatArray(float[] floatArray) {
//        for (float x : floatArray) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {

        // byte,short,int,long,float,double,char,boolean
        // Byte,Short,Integer,Long,Float,Double,Character,Boolean

        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Character[] charArray = {'a', 'b', 'A', 'C'};
        Float[] floatArray = {1.8F, 4.6F, 6.7F};

//        displayCharArray(charArray);
//        displayFloatArray(floatArray);
//        displayIntArray(intArray);

        displayArray(intArray,"A");
        displayArray(charArray,45);
        displayArray(floatArray,2.55F);

        GenericsEX<Integer,String> obj = new GenericsEX();
        obj.show(5,6);
        obj.show('A',7);
        System.out.println(obj.calculator(8));

        List<Integer> list1 = new ArrayList<>();
        list1.add(3);

        List<Integer> list2 = list1;
        System.out.println(list2);

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(2,"ABC");


//        list1.add('A');
//        list1.add(true);

        System.out.println(obj.var1);


    }
}
