package com.java;

public class Regex {  
	public static void main(String[] args) {
//		System.out.println(findAlphabets("bcc"));
//		System.out.println(findAlphabets("1aaa"));
//		System.out.println(findAlphabets("aa11"));
//		System.out.println(findAlphabets("1abb23a"));
//		System.out.println(findAlphabets("Valid"));
//		System.out.println(findAlphabets("111"));
//		System.out.println(findAlphabets("abc"));
//		System.out.println(findAlphabets("222222222"));
//		System.out.println(findAlphabets("12233ssaadAAAMMM"));
//		System.out.println(findAlphabets("2344abc93093aasOOO"));
//		System.out.println(findAlphabets("123 456"));
//		System.out.println(findAlphabets("A400088"));
//		System.out.println(findAlphabets("9876543210"));
//		System.out.println(findAlphabets("919876543210"));
//		System.out.println(findAlphabets("09876543210"));
//		System.out.println(findAlphabets("123456"));
//		System.out.println(findAlphabets("Navya"));
//		System.out.println(findAlphabets("navyas211@gmail.com"));
//		System.out.println(findAlphabets("navyas211@co.in"));
		System.out.println(findAlphabets("Asssss"));
		System.out.println(findAlphabets("Ass"));
		
	}
	
	public static boolean findAlphabets(String name) {
		//return name.matches("^[0-9]*[a-zA-Z]{3}[0-9a-z]*$");
		//return name.matches("^(\\d{0,9}[\\s]?)?\\d{6}$");
		//return name.matches("^[a-zA-Z]{3,}$");
		//return name.matches("^[0-9]*$");
		//return name.matches("^[0-9a-zA-Z]*$");
		//return name.matches("^[0-9]*[a-zA-Z]{3}[0-9a-zA-Z]*$");
		//return name.matches("^[0-6]{6}$");
//		return name.matches("^[6-9][0-9]{9}$");
//		return name.matches("^0?[6-9][0-9]{9}$");
//		return name.matches("^(0|91)?[6-9][0-9]{9}$");
//		return name.matches("^[1-9]{3}\\s{0,1}[0-9]{3}$");
		//return name.matches("^[nN][a-zA-Z]*$");
		//return name.matches("^[a-zA-Z]*[aA]$");
		//return name.matches("^[nN][a-zA-Z]*[aA]$");
//		return name.matches("^[a-zA-Z][a-zA-Z0-9_.]*@gmail[.]com$");
		//return name.matches("^[a-zA-Z][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+$");
		return name.matches("^[A-Z]{1}[a-z]{2,}$");
	}

}
