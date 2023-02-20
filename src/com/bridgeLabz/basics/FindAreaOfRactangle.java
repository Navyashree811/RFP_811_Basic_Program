package com.bridgeLabz.basics;

interface Area {
	
	int b =10;
    int a = 20;
	void area(int a, int b);
}

class Ractangle implements Area {


	@Override
	public void area(int a, int b) {
		int areaRactangle ;
		areaRactangle = a * b;
		System.out.println("The area of Ractangle is " + areaRactangle);
		
	}
	
}

public class FindAreaOfRactangle {

	public static void main(String[] args) {
		Ractangle obj = new Ractangle();
		obj.area(10,20);
	}
}
