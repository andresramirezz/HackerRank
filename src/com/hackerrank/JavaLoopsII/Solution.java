/**
 * 
 */
package com.hackerrank.JavaLoopsII;

import java.util.*;

/**
 * @author Andres Ramirez
 * File:Solution.java
 * Problem:
 * We use the integers a, b, and 𝑛 to create the following series:
 * (a + 2⁰ * b),(a + 2⁰ * b + 2¹ * b),...,(a + 2⁰ * b + 2¹ +...+ 2ⁿ⁻¹ * b)
 * You are given q queries in the form of a, b, and n.
 * For each query, print the series corresponding to the given a, b, and n
 * values as a single line of n space-separated integers.
 */
public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int t = in.nextInt();
		
			for ( int i = 0; i < t; i++ ) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			int result = 0;
			for ( int j = 0, k = 0 ; j < n && k <= n-1 ; j++, k++ ) { 
			result = (int) (result + ( Math.pow(2,k) * b ));
			System.out.print( a+result + " " );
			}
			System.out.println();
		}
		in.close();
	}
}
