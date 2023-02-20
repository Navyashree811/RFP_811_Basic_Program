package com.bridgeLabz.basics;

import java.util.Scanner;

public class SumOfThreeInteger {
	static Scanner sc = new Scanner(System.in);

	public static int getIntValue() {
		return sc.nextInt();
	}

	public static void getSumOfTHreeInteger() {
		System.out.println("Enter number");
		int n = getIntValue();

		int a[] = new int[n];
		System.out.println("Enter sum of three number");

		for (int i = 0; i < n; i++) {
			a[i] = getIntValue();
		}
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i; j < a.length; j++) {

				for (int k = j + 1; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == 0) {
						int l = a[i] + a[j] + a[k];
						//System.out.println(" Sum of these : " + a[i] + a[j] + a[k]);
						System.out.println("Sum of three number : " + l);
						

					}
				}
			}
		}
	}
	public static void main(String[] args) {
		getSumOfTHreeInteger();
	}

}
