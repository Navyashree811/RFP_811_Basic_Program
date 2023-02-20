package com.java;

interface Area {

	void areaOfRactangle(int a, int b);

}

public class AreaOfRactangle implements Area {
	int a;
	int b;

	public void areaOfRactangle(int a, int b) {
		this.a = a;
		this.b = b;
		int area = a * b;
		System.out.println("The area of Ractangle is " + area);
	}

	public static void main(String[] args) {
		AreaOfRactangle obj = new AreaOfRactangle();
		obj.areaOfRactangle(2, 4);
	}

}
