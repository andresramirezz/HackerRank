/**
 * 
 */
package com.hackerrank.EndOfFile;

import java.util.Scanner;

/**
 * @author Andres Ramirez
 * FIle: EndOfFile.java
 * Problem: The challenge here is to read n lines of input until you reach EOF, 
 * then number and print all n lines of content.
 *
 */
public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for( int i = 1; scan.hasNext() == true; i++){
		       System.out.println(i + " " + scan.nextLine());
		   }
		scan.close();
		
	}

}
