/**
 * 
 */
package com.hackerrank.JavaLoops;

import java.util.Scanner;

/**
 * @author Andres Ramirez
 * File: Solution.java
 * Given an integer,N, print its first 10 multiples.
 * Each multiple N x i (where 1≤ i ≤ 10 ) should be printed on a new line
 * in the form: N x i = result.
 */
public class Solution {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		
		int i = 1;
		while ( i < 11) {
			System.out.println(N + " x " + i + " = " + (N*i));
			i++;
		}
		scanner.close();
	}

}
