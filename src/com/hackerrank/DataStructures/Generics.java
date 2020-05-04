package com.hackerrank.DataStructures;

import java.lang.reflect.Method;

/**
 * @author andresr
 * Problem: Let's say you have an integer array and a string array. You have to 
 * write a single method printArray that can print all the elements of both arrays.
 * The method should be able to accept both integer arrays or string arrays.
 */
public class Generics {

	void printArray( Object[] o ) {
			for (Object object : o) {
				System.out.println(object);
			}
		}
	
	public static void main(String[] args) {
		Generics myPrinter = new Generics();
		Integer[] intArray = {1,2,3};
		String[] stringArray = {"Hello", "World"};
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;
		
		for (Method method : Generics.class.getDeclaredMethods()) {
			String name = method.getName();
			
			if ( name.equals("printArray")) {
				count++;
			}
		}
		
		if ( count > 1 ) {
			System.out.println("Method overloading is not allowed!");
		}
	}
}