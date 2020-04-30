package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author andresr
 * Problem: you are given a pattern. You have to check whether the syntax of the given 
 * pattern is valid. In this problem, a regex is only valid if you can compile it using 
 * the Pattern.compile method. The first line of input contains an integer N, denoting 
 * the number of test cases. The next N lines contain a string of any printable characters
 * representing the pattern of a regex.
 */
public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		for ( int i = 0; i < testCases; i++ ) {
			try {
				String pattern = in.nextLine();
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
		in.close();
	}
}