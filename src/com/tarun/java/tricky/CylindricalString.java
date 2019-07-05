package com.tarun.java.tricky;

//Programme to know whether a string is cylindrical or not.
//If the same string is repeated in itself
public class CylindricalString {

	private static boolean checkCylindrical(String s1, String s2) {
		String merged = s1+s1;
		return merged.contains(s2);

	}

	public static void main(String[] args) {


		String first =  "VIBGYOR";
		String second =  "GYORIB"; //String second =  "GYORTIB";
		boolean cyl = checkCylindrical(first, second);	
		System.out.println(cyl);
	}}
